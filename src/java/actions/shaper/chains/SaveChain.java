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
public class SaveChain extends ActionSupport {

    private int id;
    private String chain = null;
    private HashMap hashMap = null;
    private WrapperObjectInterchange objectInterchange = null;
    private String status = null;
    private String serviceLevel = null;
    private String fallback = null;
    private String source = null;
    private String direction = null;
    private String destination = null;
    private String message = null;
    private String submit = null;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public SaveChain() {
        hashMap = HashMapUtilities.getHashMapShaper();
        objectInterchange = new WrapperObjectInterchange();
    } // end SaveChain

    //==========================================================================
    /**
     * bussiness logic
     */
    @Override
    public String execute() throws Exception {

        try {

            hashMap.put("request", "save chains");
            hashMap.put("id", id);
            hashMap.put("chain", chain);
            hashMap.put("status", status);
            hashMap.put("serviceLevel", serviceLevel);
            hashMap.put("fallback", fallback);
            hashMap.put("source", source);
            hashMap.put("direction", direction);
            hashMap.put("destination", destination);
            System.out.println("guardando");
            message = (String) objectInterchange.sendReceive(hashMap);
            
            if (message == null || message.length() < 1 || message.contains("error")) {
                return Action.ERROR;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }

        return Action.SUCCESS;
    } // end execute

    //==========================================================================
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

    public HashMap getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
} // end class