/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrappers;

import java.util.HashMap;
import model.util.HashMapUtilities;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author skuarch
 */
public class WrapperObjectInterchangeTest {
    
    public WrapperObjectInterchangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sendReceive method, of class WrapperObjectInterchange.
     */
    @Test
    public void testSendReceive() throws Exception {
        
        HashMap hashmap = HashMapUtilities.getHashMapShaper();
        hashmap.put("request", "table chains");
        
        System.out.println("sendReceive");
        Object object = null;
        WrapperObjectInterchange instance = new WrapperObjectInterchange();
        Object expResult = null;
        Object result = instance.sendReceive(hashmap);
        assertEquals(expResult, result);       
    }
}