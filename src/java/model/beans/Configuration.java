package model.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author skuarch
 */
@Entity
@Table(name = "configuration")
public class Configuration implements Serializable {

    @Id
    @Column(name = "configuration_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;   
    
    @Column(name = "configuration_remote_server")
    private String remoteServer = null;
    
    @Column(name = "configuration_remote_server_port")
    private int remoteServerPort;
    
    @Column(name = "configuration_time_wait_message")
    private int timeWaitMessage;
    
    //==========================================================================
    /**
     * create a instance
     */
    public Configuration() {

    } // end Configuration    

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
