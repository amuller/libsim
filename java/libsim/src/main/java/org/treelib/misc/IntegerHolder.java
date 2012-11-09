package org.treelib.misc;

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
 * IntegerHolder A convenience class for storing modifiable integers.
 * @author Arnoldo Jose Muller Molina
 */

public class IntegerHolder implements Comparable {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntegerHolder(int value) {
        super();
        this.value = value;
    }

    public void inc() {
        value++;
    }

    public void dec() {
        value--;
    }

    public String toString() {
        return value + "";
    }

    /**
     * adds the value of x to this object's integer value.
     * @param x
     */
    public void add(int x) {
        value += x;
    }

    public int compareTo(Object o) {
        if (!(o instanceof IntegerHolder)) {
            throw new ClassCastException();
        }
        IntegerHolder i = (IntegerHolder) o;
        int res = 0;
        if (value < i.value) {
            res = 1; // we invert it :)
        } else if (value > i.value) {
            res = -1;
        }
        return res;
    }

}
