<%-- 
    Document   : CustomerView
    Created on : Dec 7, 2013, 12:29:49 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item List</title>
    </head>
    <body>
        <h1 align="center">Welcome to Bihar Bakery</h1>
        <table align="right" border="0">
            <tr>
                <td><input type="button" value="Order" onclick="window.location.href='OrderController'"/></td>
                <td><input type="button" value="Cart" onclick="window.location.href='Cart.jsp'"/></td>
                <td><input type="button" value="Status" onclick="window.location.href='OrderStatus.jsp'"/></td>
                <td><input type="button" value="Sign Out" onclick="window.location.href='index.jsp'"/></td>

            </tr>
        </table>
    </body>
</html>
