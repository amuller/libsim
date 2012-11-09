package org.treelib;

import java.util.BitSet;

import antlr.collections.AST;

import org.treelib.misc.IntegerHolder;

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
 * TreeIds ids that uniquely identify each node. Useful when creating
 * dynamic programming tables.
 * @author Arnoldo Jose Muller Molina
 */
public class TreeIds
        extends Tree {

    private int id = -1; // id used to uniquely identify this node

    private BitSet contains;

    public BitSet containedNodes() {
        assert contains != null;
        return contains;
    }

    public void updateContains() {
        if (contains == null) {
            this.updateIdInfo();
            updateContainsAux(null);
        }
    }

    public boolean containsNode(int i) {
        assert contains != null;
        return this.contains.get(i);
    }

    protected void updateContainsAux(BitSet parent) {
        TreeIds n = (TreeIds) this.getLeftmostChild();
        BitSet me = new BitSet();
        while (n != null) {
            me.set(n.getId());
            n.updateContainsAux(me);
            n = (TreeIds) n.getNextSibling();
        }
        this.contains = me;
        if (parent != null) {
            parent.or(me);// update the parent
        }
    }

    public int getId() {
        assert id != -1;
        return id;
    }

    public void updateIdInfo() {
        updateIdInfoAux(new IntegerHolder(0));
    }

    public void updateIdInfoAux(IntegerHolder i) {
        this.id = i.getValue();
        TreeIds n = (TreeIds) this.getLeftmostChild();
        while (n != null) {
            i.inc();
            n.updateIdInfoAux(i);
            n = (TreeIds) n.getNextSibling();
        }
    }

    
}
