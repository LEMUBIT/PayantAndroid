package com.lemubit.lemuel.androidpayant.operations.invoices.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantInvoiceItem {
    @PayantRequired
    String item;

    @PayantRequired
    String description;

    @PayantRequired
    String unit_cost;

    @PayantRequired
    String quantity;

    public PayantInvoiceItem(String item, String description, String unit_cost, String quantity) {
        this.item = item;
        this.description = description;
        this.unit_cost = unit_cost;
        this.quantity = quantity;
    }

    public PayantInvoiceItem() {
    }

    public String getItem() {
        return item;
    }

    /**
     * Set item's name
     * @param item
     */
    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Set item's description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getunitCost() {
        return unit_cost;
    }

    /**
     * Set item's unit cost
     * @param unit_cost
     */
    public void setunitCost(String unit_cost) {
        this.unit_cost = unit_cost;
    }

    public String getQuantity() {
        return quantity;
    }

    /**
     * Set item's quantity
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
