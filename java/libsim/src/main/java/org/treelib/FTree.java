package org.treelib;

import org.treelib.misc.IntegerHolder;

import antlr.collections.AST;

       /*	 Licensed to the Apache Software Foundation (ASF) under one
                  or more contributor license agreements.  See the NOTICE file
                  distributed with this work for additional information
                  regarding copyright ownership.  The ASF licenses this file
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
 * FTree A tree that holds an internal id for each unique complete subtree
 * and a hash code computed on the string representation of this complete
 * subtree. Additionally, the number of repetitions is included. This helps to
 * make this algorithm O(n) for equal complete subtrees of two different trees.
 * Once we found that two complete subtrees m,j belonging to different trees T1
 * T2, we can compute their intersection in linear time.
 * @author Arnoldo Jose Muller Molina
 */
public class FTree
        extends Tree {

    int hashCode = -1;

    public int id = -1;

    public IntegerHolder repetitions;

    public void update() {
        hashCode = super.toStringTree().hashCode();
    }
    
    

    public boolean equals(AST x) {
        return equals((Object) x);
    }

    public int hashCode() {
        return hashCode;
    }

    public boolean equals(Object o) {
        FTree other = (FTree) o;
        boolean res = fequalsTree(other);
        assert res == this.toStringTree().equals(other.toStringTree());
        return res;
    }

    private boolean fequalsTree(FTree other) {
        if (other == null) {
            return false;
        }
        if (this.hashCode != other.hashCode) {
            return false;
        }
        if (!this.text.equals(other.text)) {
            return false;
        }
        if (this.decendants != other.decendants) {
            return false;
        }
        if (this.getLeft() != null) {
            return this.getLeft().fequalsTreeAux(other.getLeft());
        } else if (this.getLeft() == null && other.getLeft() == null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean fequalsTreeAux(FTree other) {
        if (other == null) {
            return false;
        }
        if (!this.text.equals(other.text)) {
            return false;
        }

        boolean res = true;
        FTree left = this.getLeft();
        if (left != null) {
            res = left.fequalsTreeAux(other.getLeft());
        }
        if (res) {
            FTree sib = this.getSibbling();
            if (sib != null) {
                res = sib.fequalsTreeAux(other.getSibbling());
            }
        }
        return res;
    }

    public FTree getLeft() {
        return (FTree) this.getFirstChild();
    }

    public FTree getSibbling() {
        return (FTree) this.getNextSibling();
    }

}
