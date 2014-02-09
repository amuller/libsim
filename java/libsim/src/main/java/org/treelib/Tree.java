package org.treelib;

import java.util.LinkedList;
import java.util.List;

import antlr.BaseAST;
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
 * Tree This class provides extra functionality required by tree edit
 * distance algorithms and the like
 * @author Arnoldo Jose Muller Molina
 */

public class Tree
        extends BaseAST {

    protected int decendants = -1;

    protected String text;

    public int updateDecendantInformation() {
        decendants = 0;
        Tree n = (Tree) this.getLeftmostChild();
        while (n != null) {
            decendants += n.updateDecendantInformation();
            n = (Tree) n.getNextSibling();
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

    public Tree findFirstNodeThatMatches(String label) {
        Tree result = null;
        if (this.text.equals(label)) {
            result = this;
        } else {
            Tree n = this.getLeftmostChild();
            while (n != null && result == null) {
                result = n.findFirstNodeThatMatches(label);
                n = (Tree) n.getNextSibling();
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
        return -1;
    }

    public void initialize(int t, String txt) {
        setType(t);
        setText(txt);
    }

    public void initialize(AST t) {
        setText(t.getText());
        setType(t.getType());
    }

    public Tree() {
    }

    public Tree(int t, String txt) {
        initialize(t, txt);
    }

    public Tree(Token tok) {
        initialize(tok);
    }

    public Tree(Tree t) {
        initialize(-1, t.text);
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

    }

    public Tree getLeftmostChild() {
        return (Tree) super.getFirstChild();
    }

    /** Print out a child-sibling tree in LISP notation */
    public String prettyPrint() {
        Tree t = this;
        String ts = "";
        if (t.getFirstChild() != null)
            ts += " (";
        ts += " " + this.toString();
        if (t.getFirstChild() != null) {
            ts += ((Tree) t.getFirstChild()).prettyPrint();
        }
        if (t.getFirstChild() != null)
            ts += " )";
        if (t.getNextSibling() != null) {
            ts += ((Tree) t.getNextSibling()).prettyPrint();
        }
        return ts;
    }

    /** Print out a child-sibling tree in Q notation */
    public String toQ() {
        Tree t = this;
        String ts = "";
        ts += this.toString();
        if (t.getFirstChild() != null) {
            ts += "(";
            ts += ((Tree) t.getFirstChild()).toQ();
            ts += ")";
        }

        if (t.getNextSibling() != null) {
            ts += ",";
            ts += ((Tree) t.getNextSibling()).toQ();
        }

        return ts;
    }
    
    public int depth(){
        return depthAux(this, -1) ;
    }
    
    public  int depthAux(Tree a, int i){
        if(a == null){
            return i;
        }else{
            return Math.max(depthAux((Tree)a.getFirstChild(), i + 1), depthAux((Tree) a.getNextSibling(), i ));
        }
    }
    
    
    public int depthIndex(){
        return depthIndexAux(this, 0) ;
    }
    
    public  int depthIndexAux(Tree a, int i){
        if(a == null){
            return i;
        }else{
            return Math.max(depthIndexAux((Tree)a.getFirstChild(), i + 1), depthIndexAux((Tree) a.getNextSibling(), i +1 ));
        }
    }

    /*
     * little speed up to the normal equalsTree method
     * @see antlr.BaseAST#equalsTree(antlr.collections.AST)
     */
    public boolean equalsTree(AST t) {
        Tree j = (Tree) t;
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
        Tree j = (Tree) t;
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

    /*
     * get a list of the nodes in depth first order
     */
    public synchronized List < Tree > depthFirst() {
        LinkedList < Tree > res = new LinkedList < Tree >();
        depthFirstAux(res);
        return res;
    }

    protected void depthFirstAux(LinkedList < Tree > res) {
        res.add(this);
        Tree down = (Tree) this.getFirstChild();
        if (down != null) {
            down.depthFirstAux(res);
        }
        Tree right = (Tree) this.getNextSibling();
        if (right != null) {
            right.depthFirstAux(res);
        }
    }

    
}
