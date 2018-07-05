package com.lemubit.lemuel.androidpayant.operations.invoices.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantInvoiceItem {
    @PayantRequired
    private String item;

    @PayantRequired
    private String description;

    @PayantRequired
    private String unit_cost;

    @PayantRequired
    private String quantity;

    public PayantInvoiceItem(String item, String description, String unitCost, String quantity) {
        this.item = item;
        this.description = description;
        this.unit_cost = unitCost;
        this.quantity = quantity;
    }

    public PayantInvoiceItem() {
    }

    public String getItem() {
        return item;
    }

    /**
     * @param item item's name
     */
    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @param description item's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getunitCost() {
        return unit_cost;
    }

    /**
     * @param unitCost item's unit cost
     */
    public void setunitCost(String unitCost) {
        this.unit_cost = unitCost;
    }

    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity item's quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
