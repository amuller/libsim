package org.treelib.distance.mtd;
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
import java.util.Iterator;
import java.util.Map;

import org.treelib.Distance;
import org.treelib.FTree;
import org.treelib.misc.IntegerHolder;



/*
 Furia-chan: An Open Source software license violation detector.    
 Copyright (C) 2008 Kyushu Institute of Technology

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * MTD: Implementation of the mtd algorithm. This algorithm exploits hash codes
 * from string representation of the tree and its complete subtrees.
 * Additionally, it exploits the fact that once two complete subtrees j and m
 * that belong respectively to trees T1 and T2, the intersection of j and m and
 * all their complete subtrees can be calculated in linear time. This requires
 * to have a value of multiplicity in each node of T1 and T2.
 * @author Arnoldo Jose Muller Molina
 */

public final class MTD implements Distance<MTD>{

    private Map < FTree, Tuple > mapS;

    private Map < String, IntegerHolder > mapN;

    private int maxId;

    private FTree tree;

    public MTD(FTree x) {
        x.updateDecendantInformation();
        this.tree = x;
        mapS = new HashMap < FTree, Tuple >();
        mapN = new HashMap < String, IntegerHolder >();
        decorate(tree, new IntegerHolder(0));

    }
    
    public int getNodeCount(){
    	return tree.getSize();
    }

    private void decorate(FTree t, IntegerHolder id) {
        if (t == null) {
            return;
        }
        t.update();
        Tuple tMapped = mapS.get(t);
        if (tMapped != null) {
            assert tMapped.tree.hashCode() == t.hashCode();
            tMapped.repetitions.inc();

        } else {
            tMapped = new Tuple();
            tMapped.repetitions = new IntegerHolder(1);
            tMapped.id = id.getValue();
            tMapped.tree = t;
            mapS.put(t, tMapped);
            id.inc();
            maxId = id.getValue();
        }
        t.id = tMapped.id;
        t.repetitions = tMapped.repetitions;
        assert mapS.get(t).tree.equals(t) : mapS.get(t).tree.prettyPrint()
                + " != " + t.prettyPrint();
        assert t.equals(tMapped.tree);
        IntegerHolder node = mapN.get(t.getText());
        if (node != null) {
            node.inc();
        } else {
            mapN.put(t.getText(), new IntegerHolder(1));
        }
        decorate(t.getLeft(), id);
        decorate(t.getSibbling(), id);
    }

    public double distance(MTD other) {

        int res = ds(other);
        res += dn(other);

        return res / 2;
    }

    private int dnAux(MTD other) {
        int res = 0;
        Iterator < Map.Entry < String, IntegerHolder >> keysIt = mapN
                .entrySet().iterator();
        while (keysIt.hasNext()) {
            Map.Entry < String, IntegerHolder > entry = keysIt.next();
            IntegerHolder n2 = other.mapN.get(entry.getKey());
            if (n2 != null) {
                IntegerHolder n1 = entry.getValue();
                res += Math.min(n1.getValue(), n2.getValue());
            }
        }
        return res;
    }

    public int ds(MTD other) {
        boolean[] visited = new boolean[maxId];
        int res = ds(tree, other, visited);
        return (tree.getSize() + other.tree.getSize()) - (2 * res);
    }

    public int dn(MTD other) {
        int res = dnAux(other);
        return (tree.getSize() + other.tree.getSize()) - (2 * res);
    }

    /*
     * public int ftedAux(FSliceASTHolder other) { boolean[] visited = new
     * boolean[maxId]; int res = ds(tree, other, visited); return
     * (tree.getSize() + other.tree.getSize()) - (2 * res); }
     */

    private int ds(FTree current, MTD other, boolean[] visited) {
        if (current == null) {
            return 0;
        }
        int res = 0;
        if (!visited[current.id]) {

            Tuple m2 = other.mapS.get(current);

            if (m2 != null) {
                assert current.equals(m2.tree) : " Tree A:"
                        + current.prettyPrint() + " Tree B: "
                        + m2.tree.prettyPrint() + " hash A "
                        + current.hashCode() + " hash B " + m2.tree.hashCode();
                res = update(current, m2.tree, visited);
            } else {
                res = ds(current.getLeft(), other, visited);
            }
        }
        return res + ds(current.getSibbling(), other, visited);
    }

    private int update(FTree current, FTree current2, boolean[] visited) {
        assert current != null;
        if (visited[current.id]) {
            return 0;
        }
        visited[current.id] = true;
        int res = Math.min(current.repetitions.getValue(), current2.repetitions
                .getValue());
        return res + updateAux(current.getLeft(), current2.getLeft(), visited);
    }

    private int updateAux(FTree current, FTree current2,
            boolean[] visited) {
        if (current == null) {
            return 0;
        }
        assert current != null && current2 != null;
        int res = 0, res1 = 0, res2 = 0;

        if (!visited[current.id]) {

            visited[current.id] = true;
            res = Math.min(current.repetitions.getValue(), current2.repetitions
                    .getValue());
            res1 = updateAux(current.getLeft(), current2.getLeft(), visited);

        }
        res2 = updateAux(current.getSibbling(), current2.getSibbling(), visited);
        return res + res1 + res2;

    }

    private class Tuple {
        public FTree tree;

        public int id;

        public IntegerHolder repetitions;

        public String toString() {
            return tree.toString() + " " + id + " " + repetitions.getValue();
        }
    }

    public FTree getTree() {
        return tree;
    }

    public void setTree(FTree tree) {
        this.tree = tree;
    }

}
