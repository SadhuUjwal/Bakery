/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;
import com.bakery.beans.Display;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSLC
 */
public interface OrderDao {
public abstract ArrayList displayitm1() throws ClassNotFoundException, SQLException;
}