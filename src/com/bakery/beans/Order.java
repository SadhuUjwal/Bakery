/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.beans;

import java.io.Serializable;

/**
 *
 * @author MSLC
 */

public class Order implements Serializable {
private String itemCode;
private String itemName;
private String itemMfd;
private String itemPrice;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemMfd() {
        return itemMfd;
    }

    public void setItemMfd(String itemMfd) {
        this.itemMfd = itemMfd;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

}