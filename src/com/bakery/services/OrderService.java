/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.OrderDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSLC
 */
public class OrderService {
public ArrayList displayitm1() throws ClassNotFoundException, SQLException{
        OrderDao orderDao = DaoFactory.getOrderDao();
        return orderDao.displayitm1();
    }
}
