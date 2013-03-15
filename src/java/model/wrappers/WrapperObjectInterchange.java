package model.wrappers;

import java.io.IOException;
import model.beans.Configuration;
import model.dao.DAO;
import model.net.ObjectInterchange;

/**
 * wrapper for the class ObjectInterchange
 *
 * @author skuarch
 */
public class WrapperObjectInterchange {

    private ObjectInterchange objectInterchange = null;
    private Configuration configuration = null;

    //==========================================================================
    /**
     * create a instance
     */
    public WrapperObjectInterchange() {
        objectInterchange = new ObjectInterchange();
    } // end WrapperObjectInterchange

    //==========================================================================
    /**
     * send and receive object, this warpper open the connection send the
     * object, receive a object and close the conenction
     *
     * @param object Object serializable
     * @return Object
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws NullPointerException
     * @throws Exception
     */
    public Object sendReceive(Object object) throws IOException, ClassNotFoundException, NullPointerException, Exception {

        if (object == null) {
            throw new NullPointerException("object is null");
        }

        Object objectReturned = null;

        try {

            configuration = (Configuration) new DAO().get(1, Configuration.class);
            objectInterchange.setHost(configuration.getRemoteServer());
            objectInterchange.setPort(configuration.getRemoteServerPort());
            objectInterchange.setTimeout(configuration.getTimeWaitMessage());
            objectInterchange.connect();
            objectInterchange.sendObject(object);
            objectReturned = objectInterchange.receiveObject();

        } catch (IOException ioe) {
            throw ioe;
        } catch (ClassNotFoundException cnfe) {
            throw cnfe;
        } catch (Exception e) {
            throw e;
        } finally {
            objectInterchange.closeConnection();
        }

        return objectReturned;

    } // end sendReceive
} // end class
