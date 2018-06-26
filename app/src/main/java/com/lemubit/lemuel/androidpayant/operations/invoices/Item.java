package com.lemubit.lemuel.androidpayant.operations.invoices;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

public class Item {
    @PayantRequired
    String item;

    @PayantRequired
    String description;

    @PayantRequired
    String unit_cost;

    @PayantRequired
    String quantity;
}
