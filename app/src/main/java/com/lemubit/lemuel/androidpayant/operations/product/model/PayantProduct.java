package com.lemubit.lemuel.androidpayant.operations.product.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantProduct {
    @PayantRequired
    String name;

    @PayantRequired
    String description;

    @PayantRequired
    String unit_cost;

    @PayantRequired
    String type;

    @PayantRequired
    String status;

    public PayantProduct() {
    }

    public PayantProduct(String name, String description, String unitCost, String type, String status) {
        this.name = name;
        this.description = description;
        this.unit_cost = unitCost;
        this.type = type;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name Product's name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @param description Product's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitCost() {
        return unit_cost;
    }

    /**
     * @param unitCost Product's unit cost
     */
    public void setUnitCost(String unitCost) {
        this.unit_cost = unitCost;
    }

    public String getType() {
        return type;
    }

    /**
     * @param type Product type product or service
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    /**
     * @param status Product status 1 or 0
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
