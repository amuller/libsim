package org.treelib.distance.bdist;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.treelib.Distance;
import org.treelib.Tree;
import org.treelib.UnmatchableException;
import org.treelib.misc.IntegerHolder;





import antlr.collections.AST;


/*	 
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
pregarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.    
*/


/**
 * BDist Fast matching of trees using q-gramms for trees and other stuff taken
 * from the article: Similarity Evaluation on Tree-structured data Rui Yang,
 * Panos Kalnis Anthony K. H. Tung The heuristic that works as a nearest
 * neighbor engine is likely broken. The triangle-inequality function BDist has
 * been validated.
 * @author Arnoldo Jose Muller Molina
 */

public class BDist implements Distance<BDist>{

    private HashMap < String, Bib > brv;

    private int size = 0;

    private int treeSize = 0;

    /*
     * generate the data using the given Tree
     */
    public BDist(Tree x) {
        treeSize = x.getSize();
        brv = new HashMap < String, Bib >(x.getSize() + 1, 1);
        doItAll(x);

    }

    public int getSize() {
        return size;
    }

    public int getTreeSize() {
        return treeSize;
    }

    protected void doItAll(Tree x) {

        traverse(x, new IntegerHolder(0), new IntegerHolder(0));
    }

    protected void traverse(Tree x, IntegerHolder prePosition,
            IntegerHolder posPosition) {

        String key = generateKey(x);
        prePosition.inc();
        int pre = prePosition.getValue();
        Tree n = x.getLeftmostChild();
        while (n != null) {
            traverse(n, prePosition, posPosition);
            n = (Tree) n.getNextSibling();
        }
        posPosition.inc();
        add(key, pre, posPosition.getValue());
    }

    protected void add(String key, int pre, int pos) {
        Bib entry = this.brv.get(key);
        if (entry == null) {
            entry = new Bib();
            this.brv.put(key, entry);
        }
        entry.addPosition(pre, pos);
        this.size++;
    }

    protected String generateKey(Tree x) {
        StringBuilder res = new StringBuilder();
        res.append(e(x.getFirstChild()));
        res.append(",");
        res.append(x.getText());
        res.append(",");
        res.append(e(x.getNextSibling()));
        return res.toString();
    }

    // generate the empty string
    protected String e(AST x) {
        if (x == null) {
            return "_";
        } else {

            return x.getText();
        }
    }

    public Bib getBib(String x) {
        return this.brv.get(x);
    }

    public int posBDist(BDist x, int pr) throws UnmatchableException {
        int posBDist = posBDistAux(x, pr, true);
        posBDist = posBDist / 5;
        int prOpt = prOpt(x);
        return Math.max(posBDist, prOpt);

        // return posBDistAux(x,pr,true) / 5;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        Iterator < String > it = this.brv.keySet().iterator();
        while (it.hasNext()) {
            res.append(" <-> " + it.next());
        }
        return res.toString();
    }

    // we could try to generate an exception if the only possible combination
    // for two equal
    protected int posBDistAux(BDist x, int pr,
            boolean generateUnmatchableException) throws UnmatchableException {
        Iterator < String > it = this.brv.keySet().iterator();
        int res = 0;
        while (it.hasNext()) {
            String key = it.next();
            Bib b1 = this.getBib(key);
            Bib b2 = x.getBib(key);
            if (b2 != null) {
                int maxmap = b2.getMaximumSizedMapping(b1, pr);
                if (generateUnmatchableException && maxmap == 0) {
                    throw new UnmatchableException();
                }
                int b1c = b1.getCount();
                int b2c = b2.getCount();
                int total = b1c + b2c - (2 * maxmap);
                if (total > 0) {
                    // System.out.println("remove me");
                }
                res += total;
            } else {
                res += b1.getCount();
            }
        }
        // add also the elements of x that are not in this
        it = x.brv.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Bib b1 = this.getBib(key);
            if (b1 == null) { // if the string in x is not in this. we
                // increment res
                Bib b2 = x.getBib(key);
                res += b2.getCount();
            }
        }
        return res;
    }

    /**
     * BDist as defined by Yang
     * @param x another similarity evaluation tree
     */
    public int bDist(BDist x) {
        Iterator < Map.Entry < String, Bib >> it = this.brv.entrySet()
                .iterator();
        int res = 0;
        while (it.hasNext()) {

            Map.Entry < String, Bib > e = it.next();
            String key = e.getKey();
            Bib b1 = e.getValue();
            Bib b2 = x.getBib(key);
            if (b2 != null) {
                int b1c = b1.getCount();
                int b2c = b2.getCount();
                res += Math.abs(b1c - b2c);
            } else {
                res += b1.getCount();
            }
        }
        // add also the elements of x that are not in this
        it = x.brv.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry < String, Bib > e = it.next();
            String key = e.getKey();
            Bib b1 = this.getBib(key);
            if (b1 == null) { // if the string in x is not in this. we
                // increment res
                Bib b2 = x.getBib(key);
                res += b2.getCount();
            }
        }
        return res;
    }

    protected int prOpt(BDist x) {
        try {
            int prmin = Math.abs(this.getSize() - x.getSize());
            int prmax = Math.max(this.getSize(), x.getSize());
            int posBDistMax = posBDistAux(x, prmin, false);
            if (posBDistMax / 5 <= prmin) {
                return prmin;
            } else {
                int prhalf = -1;
                while (prmin <= prmax) {
                    prhalf = (prmin + prmax) / 2;
                    int posBDist = posBDistAux(x, prhalf, false);
                    if (posBDist / 5 <= prhalf) {
                        prmax = prhalf - 1;
                    } else {
                        prmin = prhalf + 1;
                    }
                }
                return prhalf + 1;
            }
        } catch (UnmatchableException e) {
            // this should not have happened
            assert false;
            return -100000;
        }
    }

    protected int prOpt2(BDist x) {
        try {
            int prmin = Math.abs(this.getSize() - x.getSize());
            int prmax = Math.max(this.getSize(), x.getSize());
            int pi = prmin;
            int posBDist = posBDistAux(x, pi, false);
            while (!((posBDist / 5) <= pi) && pi <= prmax) {
                pi++;
                posBDistAux(x, pi, false);
            }
            if (!((posBDist / 5) <= pi)) {
                pi = -1;
            }
            return pi;
        } catch (UnmatchableException e) {
            // this should not have happened
            assert false;
            return -100000;
        }
    }

    /**
     * validates that the contents are correct, this should be used only by
     * junit
     */
    public boolean validate(String key, int count, int pre, int pos) {
        boolean res = true;
        if (!this.brv.containsKey(key)) {
            res = false;
        } else if (brv.get(key).getCount() != count) {
            res = false;
        } else if (!brv.get(key).containsPosition(pre, pos)) {
            res = false;
        }

        return res;
    }

	@Override
	public double distance(BDist objectB) {
		return this.bDist(objectB);
	}

	@Override
	public int getNodeCount() {
		return this.getSize();
	}
}
