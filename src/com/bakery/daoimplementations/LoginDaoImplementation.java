/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Login;
import com.bakery.daointerfaces.LoginDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class LoginDaoImplementation implements LoginDao {
public String validateUser( Login login) throws ClassNotFoundException, SQLException{
        String role = "";
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select Role from LoginControl where CustomerName=? and CustomerPassword=?");
        psmt.setString(1, login.getUserName());
        psmt.setString(2, login.getPassword());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("Role");
        }
        else{
            role = "invalid";
        }
        return role;
    }


}
