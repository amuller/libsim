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
import org.treelib.Distance;
import org.treelib.Forest;
import org.treelib.Tree;




/**
 * AbstractTED Implements some common functions to all TED implementations.
 * @author Arnoldo Jose Muller Molina
 */

abstract public class AbstractTED implements Distance<AbstractTED>{
	
	public final int DeleteCost = 1;

    public final int RenameCost = 1;
    
    protected Forest tree;
    
    protected AbstractTED(Forest tree){
    	this.tree = tree;
    }
    
    public double distance(AbstractTED object){
    	return ted(this.tree, object.tree);
    }
    
    protected abstract int ted(Forest tree1, Forest tree2);

    protected int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    protected int min(int a, int b, int c, int d) {
        return min(min(a, b, c), d);
    }

    protected int min(int a, int b) {
        return Math.min(a, b);
    }

    protected int renameCost(Tree a, Tree b) {
        if (a.getText().equals(b.getText())) {
            return 0;
        } else {
            return RenameCost;
        }
    }

}
