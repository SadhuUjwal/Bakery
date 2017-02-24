/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class DBUtility {
public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con =DriverManager.getConnection("jdbc:odbc:bdd");
            return con;

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
