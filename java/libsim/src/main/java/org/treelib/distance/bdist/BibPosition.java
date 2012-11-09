package org.treelib.distance.bdist;

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
 * BibPosition: pre and post positions for the given bibBranch.
 * @author Arnoldo Jose Muller Molina
 */

public class BibPosition {
    private int pre;

    private int pos;

    BibPosition(int pre, int pos) {
        this.pre = pre;
        this.pos = pos;
    }

    public boolean withinRange(BibPosition p, int pr) {
        return (Math.abs(this.pre - p.pre) <= pr)
                && (Math.abs(this.pos - p.pos) <= pr);
    }

    public boolean equivalent(int pre, int pos) {
        return this.pre == pre && this.pos == pos;
    }
}
