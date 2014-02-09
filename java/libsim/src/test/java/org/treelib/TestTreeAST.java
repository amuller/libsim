package org.treelib;
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
import java.util.LinkedList;

import junit.framework.TestCase;

public class TestTreeAST extends TestCase {
	
	TreeForStandardTed A1;
	TreeForStandardTed A2;
	protected void setUp() throws Exception {
		super.setUp();
		A1 = TreeFactory.createTreeForStandardTed("a ( b (c ,d, e), f (g, h, i, j))");
		A2 = TreeFactory.createTreeForStandardTed("a ( b (c ,d, e), f (g(m), h, i, j))");
		A2.updateHeavyPathInformation();
	}
	
public void testVerifyFindFirstNode(){
		super.assertEquals(A1.findFirstNodeThatMatches("a").getText(), "a" );
		super.assertEquals(A1.findFirstNodeThatMatches("b").getText(), "b" );
		super.assertEquals(A1.findFirstNodeThatMatches("c").getText(), "c" );
		super.assertEquals(A1.findFirstNodeThatMatches("d").getText(), "d" );
		super.assertEquals(A1.findFirstNodeThatMatches("e").getText(), "e" );
		super.assertEquals(A1.findFirstNodeThatMatches("f").getText(), "f" );
		super.assertEquals(A1.findFirstNodeThatMatches("g").getText(), "g" );
		super.assertEquals(A1.findFirstNodeThatMatches("h").getText(), "h" );
		super.assertEquals(A1.findFirstNodeThatMatches("i").getText(), "i" );
		super.assertEquals(A1.findFirstNodeThatMatches("j").getText(), "j" );
		super.assertNull(A1.findFirstNodeThatMatches("z"));
	}
	
	public void testVerifyDescendantCount(){
		A1.updateDecendantInformation();	
		assertEquals(A1.findFirstNodeThatMatches("b").getDescendants(), 3);
		assertEquals(A1.findFirstNodeThatMatches("c").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("d").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("e").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("f").getDescendants(), 4);
		assertEquals(A1.findFirstNodeThatMatches("g").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("h").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("i").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("j").getDescendants(), 0);
		assertEquals(A1.findFirstNodeThatMatches("a").getDescendants(), 9);
	}
	
	public void testVerifyHeavyPathCalculation(){
		super.assertEquals(A2.findFirstNodeThatMatches("a").getHeavy(),
				A2.findFirstNodeThatMatches("f"));
		super.assertEquals(A2.findFirstNodeThatMatches("f").getHeavy(),
				A2.findFirstNodeThatMatches("g"));
		super.assertEquals(A2.findFirstNodeThatMatches("g").getHeavy(),
				A2.findFirstNodeThatMatches("m"));
	}
	
	public void testVerifyTopLight(){
		LinkedList<TreeForStandardTed> res = A2.topLight();
		super.assertEquals(res.size(), 4);
		super.assertEquals(res.get(0).getText(), "b");
		super.assertEquals(res.get(1).getText(), "h");
		super.assertEquals(res.get(2).getText(), "i");
		super.assertEquals(res.get(3).getText(), "j");
	}

}
