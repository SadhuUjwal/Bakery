/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Display;
import com.bakery.services.OrderService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSLC
 */

public class OrderController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try { 
            OrderService orderService = ServiceFactory.getOrderService();
            try{
                   ArrayList a1= orderService.displayitm1();
                    Iterator itr=a1.iterator();
               
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Select Item</title>");
                out.println("<body>");
                out.println("<h2 align=center>");
                out.println("Select the Items");
                out.println("</h2>");
                out.println("<h3>");
                out.println("Items");
                out.println("</h3>");
                out.println("<table border='1'>");
                
                out.println("<tr>");
                out.println("<th></th>");
                out.println("<th>");
                out.println("Item Name");
                out.println("</th>");

                out.println("<th>");
                out.println("Item Price");
                out.println("</th>");

                out.println("<th>");
                out.println("Item MFD");
                out.println("</th>");

                out.println("<th>");
                out.println("Selct Quantity<br/>(in Kg)");
                out.println("</th>");

                out.println("</tr>");

               
            
               while(itr.hasNext()){
               Display mb=(Display)itr.next();
               
                
                out.println("<form action='OrderPlaceController'>");
               // out.println("<table border='1'>");

                out.println("<tr>");

                out.println("<td><input type='checkbox' name='yes'/></td>");

                out.println("<td>");
                out.println(mb.getitemName());
               out.println("</td>");

                out.println("<td>");
                out.println(mb.getitemPrice());
                out.println("</td>");


                out.println("<td>");
                out.println(mb.getitemMfd());
                out.println("</td>");

                out.println("<td>");
                out.println("<input type='Textbox' name='quantity'/>");
                out.println("</td>");
                out.println("</tr>");
                }
                out.println("<tr>");
                out.println("<td colspan='5' align='center'><input type='submit' value='Submit'/>");
                out.println("<input type='reset' name='Reset'/></td>");

                out.println("</tr>");

               out.println("</form>");
                

            
               out.println("</table>");
               out.println("</body>");
               out.println("</html>");
            }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
            }
    }
         finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

