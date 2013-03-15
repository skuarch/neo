package actions.global;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import model.beans.Configuration;
import model.dao.DAO;

/**
 *
 * @author skuarch
 */
public class SaveConfiguration extends ActionSupport {

    private String remoteServer = null;
    private int remoteServerPort;
    private int timeWaitMessage;
    private String submit = null;
    
    //==========================================================================
    /**
    /* Create a instance
    */
    public SaveConfiguration(){

    } // end SaveConfiguration


    //==========================================================================
    /**
    /* bussiness logic
    */
    @Override
    public String execute() throws Exception{
        
        Configuration configuration;
        
        try {            
            
            configuration = (Configuration) new DAO().get(1, Configuration.class);
            configuration.setRemoteServer(remoteServer);
            configuration.setRemoteServerPort(remoteServerPort);
            configuration.setTimeWaitMessage(timeWaitMessage);
            
            new DAO().update(configuration);
            
        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }
        
        return Action.SUCCESS;
    } // end execute    

    //==========================================================================
    /**
     * validation for save configuration
     */
    @Override
    public void validate() {
        
        String rs = getRemoteServer();
        int rsp = getRemoteServerPort();
        int twm = getTimeWaitMessage();
        
        if(rs == null || "".equalsIgnoreCase(rs) || rs.length() < 1){
            addFieldError("remoteServer", getText("configuration.remote.server.empty"));
        }else if (rsp < 1){
            addFieldError("remoteServerPort", getText("configuration.remote.server.port.least"));
        }else if(twm < 2000){
            addFieldError("timeWaitMessage", getText("configuration.time.wait.message.least"));
        }
        
        
    } // end validate

    public String getRemoteServer() {
        return remoteServer;
    }

    public void setRemoteServer(String remoteServer) {
        this.remoteServer = remoteServer;
    }

    public int getRemoteServerPort() {
        return remoteServerPort;
    }

    public void setRemoteServerPort(int remoteServerPort) {
        this.remoteServerPort = remoteServerPort;
    }

    public int getTimeWaitMessage() {
        return timeWaitMessage;
    }

    public void setTimeWaitMessage(int timeWaitMessage) {
        this.timeWaitMessage = timeWaitMessage;
    }    

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
    
} // end class