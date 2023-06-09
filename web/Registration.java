/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tphilip
 */
public class Registration extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        boolean isMissingValue = false;
        String firstName = request.getParameter("firstName");
        if (isMissing(firstName))
        {
            firstName = "Missing first name";
            isMissingValue = true;
        }
        String lastName = request.getParameter("password");
        if (isMissing(lastName))
        {
            lastName = "Missing last name";
            isMissingValue = true;
        }
        String emailAddress = request.getParameter("epassword");
        if (isMissing(emailAddress))
        {
            emailAddress = "Missing email address";
            isMissingValue = true;
        }
        Cookie c1 = new LongLivedCookie("firstName", firstName);
        response.addCookie(c1);
        Cookie c2 = new LongLivedCookie("password", lastName);
        response.addCookie(c2);
        Cookie c3 = new LongLivedCookie("epassword", emailAddress);
        response.addCookie(c3);
        
        if (isMissingValue)
        {
            response.sendRedirect("registrationForm");
        }
        else
        {
            PrintWriter out = response.getWriter();
            String docType =
            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
            "Transitional//EN\">\n";
            String title = "Thanks for Registering";
            out.println(docType +
            "<HTML>\n" +
            "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
            "<BODY BGCOLOR=\"#FDF5E6\">\n" +
            "<CENTER>\n" +
            "<H1 ALIGN>" + title + "</H1>\n" +
            "<UL>\n" +
            "  <LI><B>First Name</B>: " +
                   firstName + "\n" +
            "  <LI><B>Last Name</B>: " +
                   lastName + "\n" +
            "  <LI><B>Email address</B>: " +
                   emailAddress + "\n" +
            "</UL>\n" +
            "</CENTER></BODY></HTML>");
        }
    }

  /** Determines if value is null or empty. */
  
    private boolean isMissing(String param)
    {
        return((param == null) ||
        (param.trim().equals("")));
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
