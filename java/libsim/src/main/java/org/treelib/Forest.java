package org.treelib;

import java.util.List;

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
 * Interface of a forest.
 * @author Arnoldo Jose Muller Molina
 */

public interface Forest {

	/**
     * Deletes the right tree's root node.
     * @return The resulting Forest
     */
    public abstract Forest deleteRightTreeNode();

    /**
     * Deletes the left tree's root node.
     * @return The resulting Forest
     */
    public abstract Forest deleteLeftTreeNode();

    /**
     * 
     * @return true if the leftmost tree is the heavy path.
     */
    public abstract boolean isLeftHeavy();

    /**
     * Deletes the root node of the leftmost tree, and returns
     * the remaining forest (only leftmost tree)
     * @return leftmost tree without the root node.
     */
    public abstract Forest deleteRootOnLeftTreeAndGetLeftTree();

    /**
     * Delete the leftmost tree of this forest.
     * @return Left tree.
     */
    public abstract Forest deleteLeftTree();

    /**
     * @return True if this forest is a tree, otherwise false.
     */
    public abstract boolean isTree();

    /**
     * Deletes the rightmost tree of the forest
     * @return The deleted forest.
     */
    public abstract Forest deleteRightTree();

    /**
     * @return The rightmost tree of the forest.
     * 
     */
    public abstract TreeForStandardTed getRightTree();

    /**
     * @return The leftmost tree in the forest.
     */
    public abstract TreeForStandardTed getLeftTree();


    /**
     * @return the "topLight" of this forest. 
     * @see Demaine's paper.
     */
    public abstract List < Forest > topLight();

    /**
     * 
     * @return Number of nodes in the forest.
     */
    public abstract int getSize();

    /**
     * 
     * @return True if there are no elements in the forest.
     */
    public abstract boolean isNull();
    
    
    /**
     * @return A human-readable representation of the forest, for debugging purposes.
     */
    public abstract String prettyPrint();

    /**
     * @return The rightmost tree of the Forest without the root node
     */
    public abstract Forest deleteRootOnRightTreeAndGetRightTree();

    /**
     * 
     * @return The hash string that represents this forest.
     */
    public abstract String hashString();

}
