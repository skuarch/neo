package model.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.wrappers.WrapperObjectInterchange;

/**
 *
 * @author skuarch
 */
public class Tester extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HashMap hashmap = null;
        WrapperObjectInterchange objectInterchange = null;
        Object objectReturned = null;

        try {

            objectInterchange = new WrapperObjectInterchange();

            hashmap = HashMapUtilities.getHashMapGlobal();
            hashmap.put("request", "connectivity");

            objectReturned = objectInterchange.sendReceive(hashmap);

            if (!objectReturned.equals(true)) {
                out.println("error the reponse from server is null");
            } else {
                out.println("connection successfully");
            }

        } catch (ClassNotFoundException cnfe) {
            out.println("error " + cnfe.getMessage());
            cnfe.printStackTrace();
        } catch (UnknownHostException uhe) {
            out.println("error " + uhe.getMessage());
            uhe.printStackTrace();
        } catch (Exception e) {
            out.println("error " + e.getMessage());
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
