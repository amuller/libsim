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

import org.junit.Before;
import org.treelib.distance.ted.DMRW;
import org.treelib.distance.ted.ShashaAndZhangReferenceImpl;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class TestDMRW extends AbstractTreeTester<DMRW> {
	
	@Before public void setUp() { 
		
		super.treeA = Data.treesA;
		super.treeB = Data.treesB;
		super.expectedResult = Data.tedAB;
       
    }

	@Override
	protected DMRW getDistance(String t) throws RecognitionException, TokenStreamException {
		return TreeFactory.createTedDWRW(t);
	}

	@Override
	protected void validateProperties(double result, String ta, String tb) throws RecognitionException, TokenStreamException {
		// make sure that the result is also the same as Sasha's result:
		ShashaAndZhangReferenceImpl a = TreeFactory.createTedShashaZhang(ta);
		ShashaAndZhangReferenceImpl b = TreeFactory.createTedShashaZhang(tb);		
		assertEquals(result,a.distance(b),0.0);
	}


	
	
	
    

}
