package actions.global;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author skuarch
 */
public class Logout extends ActionSupport implements SessionAware {

    private Map session1 = null;

    //==========================================================================
    /**
     * Create a instance
     */
    public Logout() {
    } // end Logout

    //==========================================================================
    /**
     * bussiness logic
     */
    @Override
    public String execute() throws Exception {

        HttpServletRequest request;

        HttpSession session2;

        try {

            session1 = ActionContext.getContext().getSession();
            session1.remove("user");
            session1.clear();

            request = ServletActionContext.getRequest();
            session2 = request.getSession();
            session2.removeAttribute("user");
            session2.invalidate();

        } catch (Exception e) {
            e.printStackTrace();
            return Action.ERROR;
        } finally {
            session1 = null;
            session2 = null;
        }

        return Action.SUCCESS;
    } // end execute

    //==========================================================================    
    @Override
    public void setSession(Map<String, Object> map) {
        session1 = map;
    }
} // end class