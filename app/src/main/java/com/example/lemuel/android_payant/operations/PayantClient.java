package com.example.lemuel.android_payant.operations;

import com.example.lemuel.android_payant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantClient {

    @PayantRequired(required = PayantRequired.Required.No)
    String company_name;

    @PayantRequired(required = PayantRequired.Required.Yes)
    String first_name;

    @PayantRequired(required = PayantRequired.Required.Yes)
    String last_name;

    @PayantRequired(required = PayantRequired.Required.Yes)
    String email;

    @PayantRequired(required = PayantRequired.Required.Yes)
    public String phone;

    @PayantRequired(required = PayantRequired.Required.No)
    String address;

    @PayantRequired(required = PayantRequired.Required.No)
    String type;

    @PayantRequired(required = PayantRequired.Required.No)
    String settlement_bank;

    @PayantRequired(required = PayantRequired.Required.No)
    String account_number;


}
