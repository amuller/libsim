package org.treelib.distance.ted;
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
import java.util.HashMap;

import org.treelib.Distance;
import org.treelib.Tree;
import org.treelib.TreeFactory;
import org.treelib.Forest;
import org.treelib.misc.IntegerHolder;



/**
 * ShashaAndZhangReferenceImpl Classic O(n^4) implementation of TED.
 * @author Arnoldo Jose Muller Molina
 */

public class ShashaAndZhangReferenceImpl
        extends AbstractTED  {

    private HashMap < String, IntegerHolder > cache;

    
    public int getNodeCount(){
    	return super.tree.getSize();
    }
    
    
    public ShashaAndZhangReferenceImpl(Forest tree) {
    	super(tree);
        init();
    }

    protected void init() {
        cache = new HashMap < String, IntegerHolder >();
        // we don't want to be filling in the default case lots of times...
        put(TreeFactory.createEmptySliceForest(), TreeFactory
                .createEmptySliceForest(), 0);
    }

    protected void init(int n, int m) {
        cache = new HashMap < String, IntegerHolder >(n * m);
        // we don't want to be filling in the default case lots of times...
        put(TreeFactory.createEmptySliceForest(), TreeFactory
                .createEmptySliceForest(), 0);
    }
    
    

    /**
     * puts the given value into the cache
     * @param a
     * @param b
     * @param value
     */
    protected void put(final Forest a, final Forest b, int value) {
        put(makeKey(a, b), value);
    }

    protected void put(String k, int value) {
        cache.put(k, new IntegerHolder(value));
    }

    /**
     * returns an integer with the given value of the cache, otherwise returns
     * -1
     * @param k
     * @return
     */
    protected int get(String k) {
        IntegerHolder r = cache.get(k);
        if (r == null) {
            return -1;
        } else {
            return r.getValue();
        }
    }

    protected String makeKey(final Forest a, final Forest b) {
        StringBuilder str = new StringBuilder(a.hashString());
        str.append(",");
        str.append(b.hashString());
        return str.toString();
    }

    protected int ted(final Forest a, final Forest b) {
        init(a.getSize(), b.getSize());
        return tedAux(a, b);
    }
    
    

    protected int tedAux(final Forest a, final Forest b) {
        int res;
        String key = makeKey(a, b);
        int v = get(key); // get catched value. I was catched. no need to do
                            // anything.
        if (v != -1) {
            res = v;
        } else if (a.isNull() && b.isNull()) {
            res = 0;
        } else if (!a.isNull() && b.isNull()) {
            res = tedAux(a.deleteRightTreeNode(), b) + DeleteCost;
        } else if (a.isNull() && !b.isNull()) {
            res = tedAux(a, b.deleteRightTreeNode()) + DeleteCost;
        } else {
            int v1 = tedAux(a.deleteRightTreeNode(), b) + DeleteCost;
            int v2 = tedAux(a, b.deleteRightTreeNode()) + DeleteCost;
            int v3 = tedAux(a.deleteRootOnRightTreeAndGetRightTree(), b
                    .deleteRootOnRightTreeAndGetRightTree())
                    + tedAux(a.deleteRightTree(), b.deleteRightTree())
                    + renameCost(a.getRightTree(), b.getRightTree());
            res = min(v1, v2, v3);
        }
        // I am not catched, store the catched value.
        if (v == -1) {
            put(key, res);
        }
        return res;
    }

    public int tedSliceAST(Tree a, Tree b) throws Exception {
        throw new Exception("cannot call this method in this class");
    }
}
