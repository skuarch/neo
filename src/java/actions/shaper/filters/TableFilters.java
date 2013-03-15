package actions.shaper.filters;

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
public class TableFilters extends ActionSupport {

    private WrapperObjectInterchange objectInterchange = null;
    private HashMap hashmap = null;
    private List tableFilters = null;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public TableFilters() {
        objectInterchange = new WrapperObjectInterchange();
        hashmap = HashMapUtilities.getHashMapShaper();
    } // end TableFilters

    //==========================================================================
    /**
     * bussiness logic
     */
    @Override
    public String execute() throws Exception {
        
        try {

            //tablefilters is a list of hashmaps
            hashmap.put("request", "table filters");        
            tableFilters = (List) objectInterchange.sendReceive(hashmap);
            
            if(tableFilters == null){
                return Action.ERROR;
            }   

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }

        return Action.SUCCESS;
    } // end execute

    public List getTableFilters() {
        return tableFilters;
    }

    public void setTableFilters(List tableFilters) {
        this.tableFilters = tableFilters;
    }
    
} // end class