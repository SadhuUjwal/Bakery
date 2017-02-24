/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Display;
import com.bakery.daointerfaces.OrderDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSLC
 */
public class OrderDaoImplementation implements OrderDao {
public ArrayList displayitm1() throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        ArrayList itm=new ArrayList();
        
        PreparedStatement psmt = con.prepareStatement("select * from Items");
       
        ResultSet rs = psmt.executeQuery();
        while(rs.next()){
            Display d=new Display();
            d.setitemName(rs.getString("ItemName"));
            d.setitemPrice(rs.getString("ItemPrice"));
            d.setitemMfd(rs.getString("ItemMFD"));
            itm.add(d);
        }
        psmt.close();
        DBUtility.closeConnection(con);
        return itm;
    }
}