package model.common;

import java.io.IOException;
import java.net.UnknownHostException;
import model.beans.Configuration;
import model.dao.DAO;
import model.net.ObjectInterchange;

/**
 * wrapper for ObjectInterchange
 *
 * @author skuarch
 */
public class SendReceiveObject {

    private ObjectInterchange objectInterchange = null;
    private Configuration configuration = null;

    //==========================================================================
    /**
     * create a instance
     */
    public SendReceiveObject() {
    } // end SendReceiveObject

    //==========================================================================
    /**
     * send and receive object.
     *
     * @return Object serializable
     */
    public Object sendReceiveObject(Object object) throws UnknownHostException, IOException, ClassNotFoundException, Exception {

        Object objectReturned = null;

        try {

            setupConfiguration();

            objectInterchange = new ObjectInterchange();
            objectInterchange.setHost(configuration.getRemoteServer());
            objectInterchange.setPort(configuration.getRemoteServerPort());
            objectInterchange.connect();
            objectInterchange.sendObject(object);
            objectReturned = objectInterchange.receiveObject();

        } catch (UnknownHostException uhe) {
            throw uhe;
        } catch (IOException ioe) {
            throw ioe;
        } catch (ClassNotFoundException cnfe) {
            throw cnfe;
        } catch (Exception e) {
            throw e;
        } finally {
            objectInterchange.closeConnection();
            objectInterchange = null;
        }

        return objectReturned;

    } // end sendReceiveObject

    //==========================================================================
    /**
     * init configuration.
     *
     * @throws Exception
     */
    private void setupConfiguration() throws Exception {
        configuration = (Configuration) new DAO().get(1, Configuration.class);
    } // end setupConfiguration
} // end class
