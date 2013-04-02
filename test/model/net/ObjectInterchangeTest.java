package model.net;

import java.util.HashMap;
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
public class ObjectInterchangeTest {

    public ObjectInterchangeTest() {
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
     * Test of connect method, of class ObjectInterchange.
     */
    @Test
    public void testConnect() throws Exception {

        HashMap hashMap = new HashMap();        
        hashMap.put("type", "sniffer");
        hashMap.put("request", "connectivity");
        String host = "192.168.208.8";
        int port = 8082;

        System.out.println("connect");
        ObjectInterchange instance = new ObjectInterchange();
        instance.setHost(host);
        instance.setPort(port);
        System.out.println("connection to " + host + " port " + port);
        instance.connect();
        System.out.println("sending object");
        instance.sendObject(hashMap);
        System.out.println("receiving object");
        Object object = instance.receiveObject();
        instance.closeConnection();

        System.out.println("object received " + object);

    }
}