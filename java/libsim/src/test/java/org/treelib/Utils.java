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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;






public class Utils{

	/**b
     * Properties loaded from the properties file.
     */
    private static Properties testProperties = null;

    /**
     * Return the properties from the test properties file.
     * @return the properties from the test properties file
     * @throws IOException If the file cannot be read.
     */
    public static Properties getTestProperties() throws IOException {
        if (testProperties == null) { // load the properties only once
            InputStream is = Utils.class
                    .getResourceAsStream(File.separator + "test.properties");
            testProperties = new Properties();
            testProperties.load(is);
            // configure log4j only once too            
        }

        return testProperties;
    }
    
    public static String getStringValue(String key) throws IOException{
    	return getTestProperties().getProperty(key);
    }
    
    public static int getIntegerValue(String key) throws NumberFormatException, IOException{
    	return Integer.parseInt(getStringValue(key));
    }
    
    public static int getMaxNumberOfNodes() throws NumberFormatException, IOException{
    	return getIntegerValue("max.tree.size");
    }
    
    
    /**
     * Get max # of trees that will be tested.
     * @return
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static int getTestTreesMax() throws NumberFormatException, IOException{
    	return getIntegerValue("max.trees");
    }
    
    public static File getTreesFile() throws IOException{
    	return new File(getStringValue("test.db.input"));
    }

}