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
import java.util.Iterator;
import java.util.List;

import org.treelib.Forest;



/**
 * DMRW: O(n^3) implementation of ted based on: An Optimal Decomposition
 * Algorithm for Tree Edit Distance Erik D. Demaine, Shay Mozes , Benjamin
 * Rossman, and Oren Weimann
 * @author Arnoldo Jose Muller Molina
 */

/* 
 */
public class DMRW
        extends ShashaAndZhangReferenceImpl  {

    public DMRW(Forest tree) {
        super(tree);
    }

    protected int ted(Forest F, Forest G) {
        init();
        // assert F.getRightTree() instanceof TreeForStandardTed;
        // F.calculateHeavyPath();
        // G.calculateHeavyPath();
        // F.updateIdInfo();
        // G.updateIdInfo();
        return ted2(F, G);
    }
    
    

    private int ted2(Forest F, Forest G) {
        int master;
        if (F.getSize() >= G.getSize()) {
            master = 0;
        } else {
            master = 1;
        }

        if (master == 0) {
            List < Forest > tl = F.topLight();
            Iterator < Forest > it = tl.iterator();
            while (it.hasNext()) {
                Forest t = it.next();
                ted2(t, G);
            }
        } else {
            List < Forest > tl = G.topLight();
            Iterator < Forest > it = tl.iterator();
            while (it.hasNext()) {
                Forest t = it.next();
                ted2(F, t);
            }
        }
        return ted3(F, G, master);
    }

    private int ted3(Forest F, Forest G, int master) {
        int res;
        String key = makeKey(F, G);
        int v = get(key); // get catched value. I was catched. no need to do
                            // anything.
        if (v != -1) {
            res = v;
        } else if (F.isNull() && G.isNull()) {
            res = 0;
        } else if (F.isNull()) {
            if (master == 0) {
                res = min(ted3(F, G.deleteRightTreeNode(), master), ted3(F, G
                        .deleteLeftTreeNode(), master))
                        + DeleteCost;
            } else if (master == 1 && G.isLeftHeavy() && !G.isTree()) {
                res = ted3(F, G.deleteRightTreeNode(), master) + DeleteCost;
            } else {
                res = ted3(F, G.deleteLeftTreeNode(), master) + DeleteCost;
            }
        } else if (G.isNull()) {
            if (master == 1) {
                res = min(ted3(F.deleteRightTreeNode(), G, master), ted3(F
                        .deleteLeftTreeNode(), G, master))
                        + DeleteCost;
            } else if (master == 0 && F.isLeftHeavy() && !F.isTree()) {
                res = ted3(F.deleteRightTreeNode(), G, master) + DeleteCost;
            } else {
                res = ted3(F.deleteLeftTreeNode(), G, master) + DeleteCost;
            }
        } else {
            if ((master == 0 && F.isLeftHeavy() && !F.isTree())
                    || (master == 1 && G.isLeftHeavy() && !G.isTree())) {
                int v0;
                if (master == 0) {
                    v0 = ted3(F, G.deleteLeftTreeNode(), master) + DeleteCost;
                } else {
                    v0 = ted3(F.deleteLeftTreeNode(), G, master) + DeleteCost;
                }
                int v1 = ted3(F, G.deleteRightTreeNode(), master) + DeleteCost;
                int v2 = ted3(F.deleteRightTreeNode(), G, master) + DeleteCost;
                int v3 = tedAux(F.deleteRootOnRightTreeAndGetRightTree(), G
                        .deleteRootOnRightTreeAndGetRightTree())
                        + tedAux(F.deleteRightTree(), G.deleteRightTree())
                        + renameCost(F.getRightTree(), G.getRightTree());
                res = min(v0, v1, v2, v3);
            } else {
                int v0;
                if (master == 0) {
                    v0 = ted3(F, G.deleteRightTreeNode(), master) + DeleteCost;
                } else {
                    v0 = ted3(F.deleteRightTreeNode(), G, master) + DeleteCost;
                }
                int v1 = ted3(F, G.deleteLeftTreeNode(), master) + DeleteCost;
                int v2 = ted3(F.deleteLeftTreeNode(), G, master) + DeleteCost;
                int v3 = tedAux(F.deleteRootOnLeftTreeAndGetLeftTree(), G
                        .deleteRootOnLeftTreeAndGetLeftTree())
                        + tedAux(F.deleteLeftTree(), G.deleteLeftTree())
                        + renameCost(F.getLeftTree(), G.getLeftTree());
                res = min(v0, v1, v2, v3);
            }
        }

        // I am not catched, store the catched value.
        if (v == -1) {
            put(key, res);
        }
        return res;
    }
    // use the unique id of each tree nodes to identify uniquely the trees.
    // this will speed up the matching! maybe...
}
