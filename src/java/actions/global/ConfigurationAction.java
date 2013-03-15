package actions.global;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import model.beans.Configuration;
import model.dao.DAO;

/**
 *
 * @author skuarch
 */
public class ConfigurationAction extends ActionSupport {

    private String remoteServer = null;
    private int remoteServerPort = 0;
    private int timeWaitMessage = 0;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public ConfigurationAction() {
    } // end ConfigurationAction

    //==========================================================================
    /**
     * /* bussiness logic
     */
    @Override
    public String execute() throws Exception {

        Configuration configuration;

        try {
            
            //get the configuration from database, the id 0 doesn't exists
            configuration = (model.beans.Configuration) new DAO().get(1, model.beans.Configuration.class);

            //set variables with the values from database
            setRemoteServer(configuration.getRemoteServer());
            setRemoteServerPort(configuration.getRemoteServerPort());
            setTimeWaitMessage(configuration.getTimeWaitMessage());

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        }

        return Action.SUCCESS;
    } // end execute

    //==========================================================================
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
} // end class