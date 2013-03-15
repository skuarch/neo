package actions.shaper.chains;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import model.util.HashMapUtilities;
import model.wrappers.WrapperObjectInterchange;

/**
 *
 * @author skuarch
 */
public class DeleteChain extends ActionSupport {

    private String message = null;
    private WrapperObjectInterchange objectInterchange = null;
    private HashMap hashMap = null;
    private int id;
    private String chain = null;    

    //==========================================================================
    /**
     * /* Create a instance
     */
    public DeleteChain() {
        objectInterchange = new WrapperObjectInterchange();
    } // end ChangeStatusChain

    //==========================================================================
    /**
     * bussiness logic
     */
    @Override
    public String execute() throws Exception {

        hashMap = HashMapUtilities.getHashMapShaper();
        hashMap.put("request", "delete chains");
        hashMap.put("id", id);        
        hashMap.put("chain", chain);        
        message = (String) objectInterchange.sendReceive(hashMap);

        return Action.SUCCESS;
    } // end execute

    //==========================================================================
    public String getMessage() {
        return message;
    }

    //==========================================================================
    public void setMessage(String message) {
        this.message = message;
    }

    public String getChain() {
        return chain;
    }

    //==========================================================================
    public void setChain(String chain) {
        this.chain = chain;
    }

    //==========================================================================
    public int getId() {
        return id;
    }

    //==========================================================================
    public void setId(int id) {
        this.id = id;
    }
} // end class