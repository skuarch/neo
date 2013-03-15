package actions.global;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.List;
import java.util.Map;
import model.beans.Users;
import model.dao.DAO;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author skuarch
 */
public class Authentication extends ActionSupport implements SessionAware {

    private Map<String, Object> session = null;
    private String username = null;
    private String password = null;
    private String submit = null;

    //==========================================================================
    /**
     * /* Create a instance
     */
    public Authentication() {
    } // end Authentication

    //==========================================================================
    /**
     * /* bussiness logic
     */
    @Override
    public String execute() throws Exception {
        
        List list = null;
        Users user = null;

        try {

            list = new DAO().hsql("from Users where name = '" + username + "' and password = '" + password + "'");

            if (list.size() < 1) {
                addFieldError("username", getText("login.error"));
                return INPUT;
            }

            session = ActionContext.getContext().getSession();
            session.put("logined", "true");
            session.put("user", username);

            user = (Users) list.get(0);
            user.setLastLogin(new Date().toString());

            new DAO().update(user);

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    } // end execute

    //==========================================================================
    /**
     * validate login form, all the fields are required.
     */
    @Override
    public void validate() {

        String user = getUsername();
        String password = getPassword();

        if (user == null || "".equals(user) || user.length() < 1) {
            addFieldError("username", getText("login.error.username"));
        } else if (password == null || "".equals(password) || password.length() < 1) {
            addFieldError("password", getText("login.error.password"));
        } else if (user.contains(" ")) {
            addFieldError("username", getText("login.error.space.user"));
        } else if (password.contains(" ")) {
            addFieldError("password", getText("login.error.space.password"));
        }

    } // end validate

    //==========================================================================
    public String getUsername() {
        return username;
    }

    //==========================================================================
    public void setUsername(String username) {
        this.username = username;
    }

    //==========================================================================
    public String getPassword() {
        return password;
    }

    //==========================================================================
    public void setPassword(String password) {
        this.password = password;
    }

    //==========================================================================
    public String getSubmit() {
        return submit;
    }

    //==========================================================================
    public void setSubmit(String submit) {
        this.submit = submit;
    }

    //==========================================================================
    public Map getSession() {
        return session;
    }

    //==========================================================================
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
} // end class