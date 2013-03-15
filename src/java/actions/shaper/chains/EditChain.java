package actions.shaper.chains;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author skuarch
 */
public class EditChain extends ActionSupport {

    private int id;
    private String chain = null;
    
    //==========================================================================
    /**
    /* Create a instance
    */
    public EditChain(){

    } // end EditChain


    //==========================================================================
    /**
    /* bussiness logic
    */
    @Override
    public String execute() throws Exception{
        return Action.SUCCESS;
    } // end execute

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }  
    

} // end class