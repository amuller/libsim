package org.treelib;
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
 * Interface that defines a general distance
 * function.
 * @author Arnoldo Jose Muller Molina
 *
 */
public interface Distance<O> {
	
	/**
	 * Calculate the distance between this object and another object
	 * 	 * @param objectB object to compare
	 * @return The distance of objectA and objectB
	 */
	double distance( O objectB);
	
	/**
	 * @return the number of nodes of the tree.
	 */
	int getNodeCount();

}
