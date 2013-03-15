package actions.shaper.chains;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.List;
import model.util.HashMapUtilities;
import model.wrappers.WrapperObjectInterchange;

/**
 *
 * @author skuarch
 */
public class TableChains extends ActionSupport {

    private WrapperObjectInterchange objectInterchange = null;
    private HashMap hashmap = null;
    private List tableChains = null;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public TableChains() {
        objectInterchange = new WrapperObjectInterchange();
        hashmap = HashMapUtilities.getHashMapShaper();
    } // end TableChains

    //==========================================================================
    /**
     * /* bussiness logic
     */
    @Override
    public String execute() throws Exception {

        try {

            //tableChains is a list of hashmaps
            hashmap.put("request", "table chains");            
            tableChains = (List) objectInterchange.sendReceive(hashmap);
            
            if(tableChains == null){
                return Action.ERROR;
            }            

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }

        return Action.SUCCESS;
    } // end execute

    //==========================================================================
    /**
     * return a list
     *
     * @return List
     */
    public List getTableChains() {
        return tableChains;
    } // end getTableChains

    //==========================================================================
    /**
     * set tableChains
     *
     * @param tableChains
     */
    public void setTableChains(List tableChains) {
        this.tableChains = tableChains;
    } // end  setTableChains
} // end class