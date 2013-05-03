package org.treelib;

import java.util.LinkedList;

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
 * TreeForStandardTed This class adds some heavy path calculations.
 * @author Arnoldo Jose Muller Molina
 */

public class TreeForStandardTed
        extends TreeIds {

    private int ttype = Token.INVALID_TYPE;

    private TreeForStandardTed heavy = null;

    public int updateDecendantInformation() {
        decendants = 0;
        TreeForStandardTed n = (TreeForStandardTed) this
                .getLeftmostChild();
        while (n != null) {
            decendants += n.updateDecendantInformation();
            n = (TreeForStandardTed) n.getNextSibling();
        }
        return decendants + 1;
    }

    /*
     * public int getDescendants(){ int decendants = 0; Tree n =
     * this.getLeftmostChild(); while(n != null){ decendants +=
     * n.getDescendants(); decendants++; n = (Tree)n.getNextSibling(); }
     * return decendants; }
     */

    public int getDescendants() {
        if (decendants == -1) {
            this.updateDecendantInformation();
        }
        return decendants;
    }

    public int getSize() {
        return getDescendants() + 1;
    }

    /**
     * toplight never
     */
    public LinkedList < TreeForStandardTed > topLight() {
        if (heavy == null) {
            updateHeavyPathInformation();
        }
        LinkedList < TreeForStandardTed > res = new LinkedList < TreeForStandardTed >();
        topLightAux(res);
        return res;
    }

    protected void topLightAux(LinkedList < TreeForStandardTed > m) {
        TreeForStandardTed n = this.getLeftmostChild();
        while (n != null) {
            if (n != this.heavy) {
                m.add(n);
            } else {
                n.topLightAux(m);
            }
            n = (TreeForStandardTed) n.getNextSibling();
        }
    }

    public TreeForStandardTed getHeavy() {
        return this.heavy;
    }

    public void updateHeavyPathInformation() {

        if (getLeftmostChild() != null) {
            TreeForStandardTed biggest = this.getLeftmostChild();
            biggest.updateHeavyPathInformation();
            TreeForStandardTed n = (TreeForStandardTed) this
                    .getLeftmostChild().getNextSibling();
            while (n != null) {
                if (biggest.getDescendants() < n.getDescendants()) {
                    biggest = n;
                }
                n.updateHeavyPathInformation();
                n = (TreeForStandardTed) n.getNextSibling();
            }
            this.heavy = biggest;
        }
    }

    public TreeForStandardTed findFirstNodeThatMatches(String label) {
        TreeForStandardTed result = null;
        if (this.text.equals(label)) {
            result = this;
        } else {
            TreeForStandardTed n = this.getLeftmostChild();
            while (n != null && result == null) {
                result = n.findFirstNodeThatMatches(label);
                n = (TreeForStandardTed) n.getNextSibling();
            }
        }
        return result;
    }

    /** Get the token text for this node */
    public String getText() {
        return text;
    }

    /** Get the token type for this node */
    public int getType() {
        return ttype;
    }

    public void initialize(int t, String txt) {
        setType(t);
        setText(txt);
    }

    public void initialize(AST t) {
        setText(t.getText());
        setType(t.getType());
    }

    public TreeForStandardTed() {
    }

    public TreeForStandardTed(int t, String txt) {
        initialize(t, txt);
    }

    public TreeForStandardTed(Token tok) {
        initialize(tok);
    }

    public TreeForStandardTed(TreeForStandardTed t) {
        initialize(t.ttype, t.text);
    }

    public void initialize(Token tok) {
        setText(tok.getText());
        setType(tok.getType());
    }

    /** Set the token text for this node */
    public void setText(String text_) {
        text = text_;
    }

    /** Set the token type for this node */
    public void setType(int ttype_) {
        ttype = ttype_;
    }

    public TreeForStandardTed getLeftmostChild() {
        return (TreeForStandardTed) super.getFirstChild();
    }

    /** Print out a child-sibling tree in LISP notation */
    public String prettyPrint() {
        TreeForStandardTed t = this;
        String ts = "";
        if (t.getFirstChild() != null)
            ts += " (";
        ts += " " + this.toString();
        if (t.getFirstChild() != null) {
            ts += ((TreeForStandardTed) t.getFirstChild()).prettyPrint();
        }
        if (t.getFirstChild() != null)
            ts += " )";
        if (t.getNextSibling() != null) {
            ts += ((TreeForStandardTed) t.getNextSibling()).prettyPrint();
        }
        return ts;
    }

    /*
     * little speed up to the normal equalsTree method
     * @see antlr.BaseAST#equalsTree(antlr.collections.AST)
     */
    public boolean equalsTree(AST t) {
        TreeForStandardTed j = (TreeForStandardTed) t;
        if (j.getSize() != this.getSize()) { // little speed up! ;)
            return false;
        } else {
            return super.equalsTree(t);
        }
    }

    /*
     * 1 = equal 0 = not equal 2 = equal if we rename the root 3 = children not
     * equal but the same root
     * @see antlr.BaseAST#equalsTree(antlr.collections.AST)
     */
    public int detailedTreeComparison(AST t) {
        TreeForStandardTed j = (TreeForStandardTed) t;
        if (j.getSize() != this.getSize()) { // little speed up! ;)
            if (this.equals(t)) {
                return 3;
            } else {
                return 0;
            }
        } else {
            return detailedTreeAux(t);
        }
    }

    /**
     * Is tree rooted at 'this' equal to 't'? The siblings of 'this' are
     * ignored.
     */
    protected int detailedTreeAux(AST t) {
        int res = -1;
        // check roots first.

        // if roots match, do full list match test on children.
        if (this.getFirstChild() != null) {
            if (this.getFirstChild().equalsList(t.getFirstChild())) {
                res = 2;
            } else {
                res = 0;
            }
        }
        // sibling has no kids, make sure t doesn't either
        else if (t.getFirstChild() != null) {
            res = 0;
        }

        if (this.equals(t) && (res == 2 || res == -1)) {
            res = 1;
        }
        if (res == -1) {
            res = 0;
        }
        if (this.equals(t) && res == 0) {
            res = 3;
        }

        return res;
    }

    
    

}
