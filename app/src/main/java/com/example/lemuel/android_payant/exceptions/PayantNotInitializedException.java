package com.example.lemuel.android_payant.exceptions;

import com.example.lemuel.android_payant.Payant;

public class PayantNotInitializedException extends PayantException {
    public PayantNotInitializedException(String detailMessage) {
        super(detailMessage);
    }
}
