/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Display;
import com.bakery.services.DisplayService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSLC
 */

public class OrderPlaceController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String check = request.getParameter("yes");
            Display displayInfo=new Display();

            ArrayList dis=new ArrayList();
            Iterator itr = dis.iterator();
            while(itr.hasNext()){
                Display d1=new Display();
                if(check!=null){
                    d1.setitemName(request.getParameter("itemCode"));
                    d1.setitemName(request.getParameter("itemName"));
                    d1.setitemName(request.getParameter("itemPrice"));
                    d1.setitemName(request.getParameter("itemMfd"));
                }
                displayInfo=d1;
            }
            boolean i1=false;
            Display a1=new Display();
            DisplayService displayService = ServiceFactory.getDisplayService();
        try{
                a1=displayService.displayitm(displayInfo);
           }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
        }

        if( i1==false){
            RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
            rd.forward(request, response);

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

