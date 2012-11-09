package org.treelib;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import antlr.Token;
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
 * Another Forest implementation with extra functionality for DMRW.
 * @author Arnoldo Jose Muller Molina
 */

public class ForestStd implements Forest {
    private LinkedList < TreeForStandardTed > trees;

    private int n = -1;

    private int heavyIndex = -1;

    private int getHeavyIndex() {
        if (heavyIndex == -1) {
            updateCachedData();
        }
        return heavyIndex;
    }

    public boolean isLeftHeavy() {

        return getHeavyIndex() == 0;
    }

    public int getSize() {
        if (n == -1) {
            updateCachedData();
        }
        return n;
    }

    public boolean isTree() {
        return trees.size() == 1;
    }

    public void updateDescendant() {
        assert this.isTree();
        this.trees.getLast().updateDecendantInformation();
    }

    public void updateIdInfo() {
        assert this.isTree();
        this.trees.getLast().updateIdInfo();
    }

    public void updateContains() {
        assert this.isTree();
        this.updateIdInfo();
        this.trees.getLast().updateContains();
    }

    protected void updateCachedData() {
        Iterator < TreeForStandardTed > it = trees.iterator();
        int i = 0;
        n = 0;
        int heavy_value = -1;
        while (it.hasNext()) {
            TreeForStandardTed node = it.next();
            if (node.getDescendants() > heavy_value) {
                heavyIndex = i;
                heavy_value = node.getDescendants();
            }
            i++;
            this.n += node.getSize();
        }
    }

    public ForestStd() {
        this.treeSet(new LinkedList < TreeForStandardTed >());
    }

    public ForestStd(TreeForStandardTed t) {
        trees = new LinkedList < TreeForStandardTed >();
        this.treeAddRight(t);
    }

    private ForestStd(LinkedList < TreeForStandardTed > t) {
        this.treeSet(t);
    }

    private void emptyCache() {
        this.heavyIndex = -1;
        this.n = -1;
    }

    private void treeSet(LinkedList < TreeForStandardTed > t) {
        trees = t;
        emptyCache();
    }

    private void treeAddRight(TreeForStandardTed t) {
        trees.add(t);
        emptyCache();
    }

    private void treeAddLeft(TreeForStandardTed t) {
        trees.addFirst(t);
        emptyCache();
    }

    private void treeRemoveRight() {
        trees.removeLast();
        emptyCache();
    }

    private void treeRemoveLeft() {
        trees.removeFirst();
        emptyCache();
    }

    /** Just creates a new array without copying the trees */
    public final ForestStd shallowCloneForest() {
        LinkedList < TreeForStandardTed > n = new LinkedList < TreeForStandardTed >();
        Iterator < TreeForStandardTed > it = trees.iterator();
        while (it.hasNext()) {
            n.add(it.next());
        }
        return new ForestStd(n);
    }

    /**
     * Adds at the end of the forest (right) the given Tree and all his
     * sibblings
     */
    protected final void appendSiblings(TreeForStandardTed x) {
        TreeForStandardTed p = x;
        while (p != null) {
            this.treeAddRight(p);
            p = (TreeForStandardTed) p.getNextSibling();
        }
    }

    protected final void insertSiblings(TreeForStandardTed x) {
        TreeForStandardTed p = x;
        if (x != null) {
            insertSiblings((TreeForStandardTed) x.getNextSibling());
            this.treeAddLeft(x);
        }
    }

    /*
     * (non-Javadoc)
     * @see furia.slice.SliceForest#deleteRightTreeNode()
     */
    public final ForestStd deleteRightTreeNode() {
        // assert ! isNull();
        LinkedList < TreeForStandardTed > n = new LinkedList < TreeForStandardTed >();
        int s = trees.size() - 1;
        Iterator < TreeForStandardTed > it = trees.iterator();
        int i = 0;
        while (true) {
            TreeForStandardTed j = it.next();
            if (i < s) {
                n.add(j);
            } else {
                break;
            }
            i++;
        }
        ForestStd res = new ForestStd(n);
        res.appendSiblings(this.getRightTree().getLeftmostChild());
        return res;
    }

    public final ForestStd deleteLeftTreeNode() {
        // assert ! isNull();
        LinkedList < TreeForStandardTed > n = new LinkedList < TreeForStandardTed >();
        Iterator < TreeForStandardTed > it = trees.iterator();
        int i = 0;
        while (it.hasNext()) {
            TreeForStandardTed j = it.next();
            if (i != 0) {
                n.add(j);
            }
            i++;
        }
        ForestStd res = new ForestStd(n);
        res.insertSiblings(this.getLeftTree().getLeftmostChild());
        return res;
    }

    protected final void deleteRightTreeNodeDestructive() {
        // assert ! isNull();
        TreeForStandardTed sibling = this.getRightTree().getLeftmostChild();
        this.treeRemoveRight();
        this.appendSiblings(sibling);
    }

    protected final void deleteLeftTreeNodeDestructive() {
        // assert ! isNull();
        TreeForStandardTed sibling = this.getLeftTree().getLeftmostChild();
        this.treeRemoveLeft();
        this.insertSiblings(sibling);
    }

    /*
     * (non-Javadoc)
     * @see furia.slice.SliceForest#deleteRightTree()
     */
    public final ForestStd deleteRightTree() {
        // assert ! isNull();
        ForestStd res = shallowCloneForest();
        res.treeRemoveRight();
        return res;
    }

    public final ForestStd deleteLeftTree() {
        // assert ! isNull();
        ForestStd res = shallowCloneForest();
        res.treeRemoveLeft();
        return res;
    }

    /*
     * (non-Javadoc)
     * @see furia.slice.SliceForest#getRightTree()
     */
    public final TreeForStandardTed getRightTree() {
        return trees.getLast();
    }

    /*
     * (non-Javadoc)
     * @see furia.slice.SliceForest#getLeftTree()
     */
    public final TreeForStandardTed getLeftTree() {
        return trees.getFirst();
    }

    public final boolean isNull() {
        return 0 == trees.size();
    }

    public void calculateHeavyPath() {
        Iterator < TreeForStandardTed > it = trees.iterator();
        while (it.hasNext()) {
            TreeForStandardTed s = it.next();
            s.updateHeavyPathInformation();
        }
    }

    public List < Forest > topLight() {
        LinkedList < Forest > res = new LinkedList < Forest >();
        int heavy = this.getHeavyIndex();
        Iterator < TreeForStandardTed > it = trees.iterator();
        int i = 0;
        while (it.hasNext()) {
            TreeForStandardTed s = it.next();
            if (i != heavy) {
                res.add(new ForestStd(s));
            } else {
                Iterator < TreeForStandardTed > it2 = s.topLight()
                        .iterator();
                while (it2.hasNext()) {
                    res.add(new ForestStd(it2.next()));
                }
            }
            i++;
        }
        return res;
    }

    /*
     * (non-Javadoc)
     * @see furia.slice.SliceForest#deleteRootOnRightTreeAndGetRightTree()
     */
    public final ForestStd deleteRootOnRightTreeAndGetRightTree() {
        ForestStd n = new ForestStd(getRightTree());
        n.deleteRightTreeNodeDestructive();
        return n;
    }

    public final ForestStd deleteRootOnLeftTreeAndGetLeftTree() {
        ForestStd n = new ForestStd(getLeftTree());
        n.deleteLeftTreeNodeDestructive();
        return n;
    }

    /*
     * the hash code for this forest is just a list of the hash codes of each of
     * the heads of each member of the trees array. That will give a unique
     * representation of a forest return a string with the hash code that
     * represents this forest
     * @see furia.slice.SliceForest#hashString()
     */
    public final String hashString() {
        StringBuilder res = new StringBuilder();
        Iterator < TreeForStandardTed > it = trees.iterator();
        while (it.hasNext()) {
            res.append(it.next().hashCode());
            res.append("-");
        }
        return res.toString();
    }

    public String prettyPrint() {
        StringBuilder res = new StringBuilder();
        Iterator < TreeForStandardTed > it = trees.iterator();
        while (it.hasNext()) {
            res.append(it.next().toStringTree());
        }
        return res.toString();
    }

}
