package org.treelib.distance.bdist;

import java.util.Iterator;
import java.util.LinkedList;
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
 * Bib holds the post and pre count for the given bibBranch. (the branch triple
 * is stored in a hash table elsewhere)
 * @author Arnoldo Jose Muller Molina
 */

public class Bib {

    private int count = 0;

    private List < BibPosition > positions = new LinkedList < BibPosition >();

    protected void incCount() {
        count++;
    }

    public void addPosition(int pre, int pos) {
        incCount();
        this.positions.add(new BibPosition(pre, pos));
        assert count == positions.size();
    }

    /*
     * returns the maximum sized mapping for the given position
     */
    protected int getMaxPos(BibPosition p, int pr) {
        int res = 0;
        Iterator < BibPosition > it = positions.iterator();
        while (it.hasNext()) {
            BibPosition otherBib = it.next();
            if (p.withinRange(otherBib, pr)) {
                res++;
            }
        }
        return res;
    }

    public int getMaximumSizedMapping(Bib b, int pr) {
        Iterator < BibPosition > it = b.positions.iterator();
        int res = 0;
        while (it.hasNext()) {
            BibPosition otherBib = it.next();
            int t = this.getMaxPos(otherBib, pr);
            // if(t > res){
            // res = t;
            // }
            // or
            // res +=t;
            if (t > 0) {
                res++;
            }
        }
        return res;
    }

    public int getCount() {
        return this.count;
    }

    public boolean containsPosition(int pre, int pos) {
        Iterator < BibPosition > it = this.positions.iterator();
        boolean res = false;
        while (it.hasNext()) {
            BibPosition otherBib = it.next();
            if (otherBib.equivalent(pre, pos)) {
                res = true;
                break;
            }
        }
        return res;
    }

}
