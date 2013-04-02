package model.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMapUtilities is a collections of static methods to help in the creation
 * of hashmaps
 *
 * @author skuarch
 */
public class HashMapUtilities {

    //==========================================================================
    /**
     * this is a util class doesn't need a public constructor, all the methods
     * are statics
     */
    private HashMapUtilities() {
    } // end hashMapsUtilities        

    //==========================================================================
    /**
     * create a hashmap, set some keys and return it.
     *
     * @return HashMap
     */
    public static HashMap getHashMapGlobal() {

        HashMap hashMap = new HashMap();
        hashMap.put("request", "");
        hashMap.put("type", "global");

        return hashMap;
    } // end getHashMapShaper

    //==========================================================================
    /**
     * create a hashmap, set some keys and return it.
     *
     * @return HashMap
     */
    public static HashMap getHashMapShaper() {

        HashMap hashMap = new HashMap();
        hashMap.put("request", "");
        hashMap.put("type", "shaper");

        return hashMap;
    } // end getHashMapShaper

    //==========================================================================
    /**
     * 3
     * create a hashmap, set some keys and return it.
     *
     * @return HashMap
     */
    public static HashMap getHashMapFilter() {

        HashMap hashMap = new HashMap();
        hashMap.put("request", "");
        hashMap.put("type", "filter");
        hashMap.put("view", "not applicable");
        hashMap.put("job", "");
        hashMap.put("limits", "not applicable");

        return hashMap;
    } // end getHashMapFilter

    //==========================================================================
    /**
     * create a hashmap form other hashmap with the same keys and values.
     *
     * @param hashMap HashMap
     * @return HashMap
     * @throws Exception
     */
    public static HashMap createHashMapFromHashMap(HashMap hashMap) throws Exception {

        HashMap newHashMap = new HashMap();
        Iterator it = null;

        try {

            it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry) it.next();
                newHashMap.put(e.getKey(), e.getValue());
            }

        } catch (Exception e) {
            throw e;
        }

        return newHashMap;

    } // end createHashMapFromHashMap
} // end class
