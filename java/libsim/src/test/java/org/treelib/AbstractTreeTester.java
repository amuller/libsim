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
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;



import antlr.RecognitionException;
import antlr.TokenStreamException;
/**
 * Abstract class that holds the logic for
 * tree tests.
 * @author Arnoldo Jose Muller Molina
 *
 * @param <D> Distance function to be tested.
 */
public abstract class AbstractTreeTester<D extends Distance> {
	
	
	protected String[] treeA;
	protected String[] treeB;
	protected double[] expectedResult;
	
	private static Logger logger =
		 Logger.getLogger(AbstractTreeTester.class.getName());
	
	/**
	 * First stage tests use a set of pairs of trees.
	 * We have calculated the results of comparing each pair.
	 * Therefore, D(treeA[i], treeB[i]) == expectedResult[i] for all i.
	 * where D is the distance function we are testing.
	 * Subclasses are responsible of initializing these values.
	 * @throws TokenStreamException 
	 * @throws RecognitionException 
	 */
	@Test
	public void TestBasic() throws RecognitionException, TokenStreamException{
		assert treeA.length == treeB.length && expectedResult.length == treeB.length;
		int i = 0;
		long totalTimeNano = 0;
		for(String tA : treeA){
			String tB = treeB[i];
			double expected = expectedResult[i];
			totalTimeNano += validate(tA, tB, expected);
			i++;
		}
		logger.info("Avg. time: " + totalTimeNano / treeA.length + "Nanosec" );
	}
	
	/**
	 * Take a lot of trees and compare the results of the
	 * function against other functions to make sure
	 * fundamental properties of the functions are preserved.
	 * @throws IOException 
	 * @throws TokenStreamException 
	 * @throws RecognitionException 
	 */
	@Test
	public void TestTrees() throws IOException, RecognitionException, TokenStreamException{
		File db = Utils.getTreesFile();
		BufferedReader r = new BufferedReader(new FileReader(db));
        String re = r.readLine();
        // we will first load the trees we need.       
        int i = 0;
        final int max = Utils.getTestTreesMax(); // max # of trees
        String[] trees = new String[max];        
        while (re != null && i < max) {
        	D t = this.getDistance(re);
        	if(t.getNodeCount() <= Utils.getMaxNumberOfNodes()){
        		trees[i] = re;  
        		i++;
        	}
            re = r.readLine();
           
        }
        i = 0;
        long totalTimeNano = 0;
        while(i < max){
        	int cx = 0;
        	while(cx < max){
        		totalTimeNano += validate(trees[i], trees[cx], -1);
        		cx++;
        	}
        	i++;
        }
        logger.info("Avg. time: " + totalTimeNano / (i * i) + "Nanosec" );
	}
	
	/**
	 * Validate the tree tA and tB using the expected result. 
	 * @param tA first tree to validate
	 * @param tB second tree to validate
	 * @param expected Expected value of the validation (if < 0 then we do not require D(tA,tB) == expected
	 * @return # of elapsed nanoseconds.
	 * @throws RecognitionException
	 * @throws TokenStreamException
	 */
	private long validate(String tA, String tB, double expected) throws RecognitionException, TokenStreamException{
		D dA= getDistance(tA);
		D dB = getDistance(tB);
		long current = System.nanoTime();
		double result = dA.distance(dB);
		long elapsed = System.nanoTime() - current;			
		logger.info("Elapsed time for distance: " + dA.getClass().getSimpleName() + " " + result + " " + elapsed + "Nanosec");
		validateProperties(result, tA,tB);
		if(expected >= 0){
			assertEquals("Tree A: " + tA + " " + "\nTree B: " + tB, expected, result, 0.0);
		}
		return elapsed;
	}
	/**
	 * Confirm that the result obtained in validate also
	 * holds some properties. Each sub-class will decide which properties
	 * should be validated
	 * @param result Tree distance result.
	 * @param tA tree that was matched in string form
	 * @param tB tree that was matched in string form.
	 * @throws TokenStreamException 
	 * @throws RecognitionException 
	 */
	protected abstract void validateProperties(double result, String tA, String tB ) throws RecognitionException, TokenStreamException;
	
	/**
	 * Returns the distance D for the given tree t.
	 * @param t Tree.
	 * @return The distance that will be tested.
	 * @throws TokenStreamException 
	 * @throws RecognitionException 
	 */
	protected abstract D getDistance(String t) throws RecognitionException, TokenStreamException;

}
