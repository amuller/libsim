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
/**
 * Includes some data to perform the tests.
 * @author amuller
 *
 */
public class Data {
	
	/**
	 * treesA and treesB are used to verify that distance
	 * functions are returning the values they should be returning
	 * a vector of doubles is created for each function to 
	 * verify the values are being returned correctly.
	 * Hint: writing new entries in the beginning of the arrays helps a lot.
	 */
	public static String[] treesA = {"m(k(r,j,s,d), l)", "a()", "a ( b (c ,d, e), f (g, d, e, h))", "a ( b, c)", "a()" , "a ( b (c ,d, e), f (g, d, e, h))", "a ( b (c ,d, e), f (g, d, e, h))", "a (d, e)", "sum(phi(first, second),2)"};
	public static String[] treesB = {"j(s,d)","a()", "a ( b (c ,d, e), z (g, d, e, h))", "f  ( b, c)", "a(b)","a ( b (c ,d, e), z (g, d, e))", "m ( b (c ,d), z (g, d, e))", "c (f, d (x,z,k))", "sumb(phi(first,second, gomi, gomi, gomi), 2) "};
	public static double[] tedAB = {5, 0, 1,1 , 1, 2,                                                                                       4,                             6                 ,4  };

	public static double[] NA = {-1,-1, -1,-1 , -1, -1,-1,-1,-1 };

	
	
	// some more example trees for the future:
	/**
	 *  String[][] trees = { 
            {"A(B, C(E,F(G)),D)", "H(B,D,C(E,F(G)))"},
            {"d(Y(), z(T(), b(2)), H())","M(Y(), H(), z(T(), b(2)) )"},
            {"A(B,C(B,E))", "K(J(B,S), E)"}, // t1,t2
            {"P(4)",  "S(T, Z(Y, d(Y, d(Y,W,c,W), c)))"},
            {"A(B,C(B,E))", "A(C(B,B), E)"}, // t1,t2
            {"A(B,C(B,E))", "A(E, C(B,B))"}, // t1,t3
            
            {"a(b(e(f)),c(e(f),d))", "a(b(e(f),c(e(f),d)))"},
            {"a(b,c(e(f),d))", "a(b,c(e(f),e))"}, 
            {"a(b,c(e(f),d))", "a(b(c(e(f),d)))"},
            
            {"a(b(c(e,d)), f)", "a(b,c(e,d(f)))"},
            {"a(b(c(e(f),d)))", "a(b(c(e(f),e)))"}, 
            {"$(V(U(M(),X()),p(Q(J(S(T(),R(S(T(),U(M(),X())),P(8.0))),b(8)),b(4)), Q(a(),b(-1)))),%(p(S(T(),%(K(Y(), W(), p(W(), Q(a(),b(6)), Q(a(),b(2)))),b(255))), S(T(),x(a(), b(1)))),b(1)))",
                "Q(U(S(T(),d(Y(), S(T(),Z(Y(), Z(Y(), W()))))),X()),Q(U(S(T(),d(Y(), S(T(),Z(Y(), Z(Y(), W()))))),X()),U(S(T(),d(Y(), S(T(),Z(Y(), Z(Y(), W()))))),X())))"
            },
            {"p(O(), U(M(),X()), d(Y(), z(T(), d(Y()))))",  "d(Y(), J(W(),d(Y())))"}
         
            {"S(T(),Z(Y(), d(Y(), d(Y(), W(), c(), W()), c())))", 
                "Q(Q(U(a(),X()),R(L(U(a(),X()),U(d(Y()),X())),b(2))),d(Y()))"},
                {"d(Y(), z(T(), b(2)), H())","Z(Y(), H(), z(T(), b(2)))"},
                
               
                {"d(Y(), z(T(), b(2)), H())","B(Y(), z(T(), b(2)), H())"},
             
                {"p(a(x),b(x))", "m(a(x),b(x))"}, 
	 */
}
