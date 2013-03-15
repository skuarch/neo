package actions.shaper.chains;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashMap;
import model.util.HashMapUtilities;
import model.wrappers.WrapperObjectInterchange;

/**
 *
 * @author skuarch
 */
public class RequestDataEditChain extends ActionSupport {

    private int id;
    private String chain = null;
    private HashMap hashMap = null;
    private WrapperObjectInterchange objectInterchange = null;
    private ArrayList arrayList = null;
    private String status = null;
    private String[] serviceLevel = null;
    private String[] fallbacks = null;
    private String[] source = null;
    private String[] direction = null;
    private String[] destination = null;
    private ArrayList statusRadios = null;
    private String defaultValueStatus = null;
    private String defaultValueServiceLevel = null;
    private String defaultValueFallback = null;
    private String defaultValueSource = null;
    private String defaultValueDirection = null;
    private String defaultValueDestination = null;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public RequestDataEditChain() {
        objectInterchange = new WrapperObjectInterchange();
    } // end RequestDataEditChain

    //==========================================================================
    /**
     * /* bussiness logic
     */
    @Override
    public String execute() throws Exception {

        try {

            hashMap = HashMapUtilities.getHashMapShaper();
            hashMap.put("request", "get data chains");
            hashMap.put("id", id);
            hashMap.put("chain", chain);

            arrayList = (ArrayList) objectInterchange.sendReceive(hashMap);

            //validations
            if (arrayList == null || arrayList.size() < 1) {
                return Action.ERROR;
            }

            //mandatory variables
            status = (String) arrayList.get(2);
            serviceLevel = (String[]) arrayList.get(3);
            fallbacks = (String[]) arrayList.get(4);
            source = (String[]) arrayList.get(5);
            direction = (String[]) arrayList.get(6);
            destination = (String[]) arrayList.get(7);

            //radio buttons
            if (status.equalsIgnoreCase("y")) {
                defaultValueStatus = "enabled";
            } else {
                defaultValueStatus = "disabled";
            }
            statusRadios = new ArrayList();
            statusRadios.add("enabled");
            statusRadios.add("disabled");
            
            //service lebel "select"
            defaultValueServiceLevel = serviceLevel[0];
            
            //fallback "select"
            defaultValueFallback = fallbacks[0];
            
            //source "select"
            defaultValueSource = source[0];
            
            //direction "select"
            defaultValueDirection = direction[0];
            
            //destination "select"
            defaultValueDestination = destination[0];            

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String[] serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String[] getFallbacks() {
        return fallbacks;
    }

    public void setFallbacks(String[] fallbacks) {
        this.fallbacks = fallbacks;
    }

    public String[] getSource() {
        return source;
    }

    public void setSource(String[] source) {
        this.source = source;
    }

    public String[] getDirection() {
        return direction;
    }

    public void setDirection(String[] direction) {
        this.direction = direction;
    }

    public String[] getDestination() {
        return destination;
    }

    public void setDestination(String[] destination) {
        this.destination = destination;
    }

    public ArrayList getStatusRadios() {
        return statusRadios;
    }

    public void setStatusRadios(ArrayList statusRadios) {
        this.statusRadios = statusRadios;
    }

    public String getDefaultValueStatus() {
        return defaultValueStatus;
    }

    public void setDefaultValueStatus(String defaultValueStatus) {
        this.defaultValueStatus = defaultValueStatus;
    }

    public String getDefaultValueServiceLevel() {
        return defaultValueServiceLevel;
    }

    public void setDefaultValueServiceLevel(String defaultValueServiceLevel) {
        this.defaultValueServiceLevel = defaultValueServiceLevel;
    }

    public String getDefaultValueFallback() {
        return defaultValueFallback;
    }

    public void setDefaultValueFallback(String defaultValueFallback) {
        this.defaultValueFallback = defaultValueFallback;
    }    

    public String getDefaultValueSource() {
        return defaultValueSource;
    }

    public void setDefaultValueSource(String defaultValueSource) {
        this.defaultValueSource = defaultValueSource;
    }   

    public String getDefaultValueDirection() {
        return defaultValueDirection;
    }

    public void setDefaultValueDirection(String defaultValueDirection) {
        this.defaultValueDirection = defaultValueDirection;
    }    

    public String getDefaultValueDestination() {
        return defaultValueDestination;
    }

    public void setDefaultValueDestination(String defaultValueDestination) {
        this.defaultValueDestination = defaultValueDestination;
    }    
    
} // end class