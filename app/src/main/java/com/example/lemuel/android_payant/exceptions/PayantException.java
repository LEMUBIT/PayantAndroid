package com.example.lemuel.android_payant.exceptions;

/**
 * PayantException is Payant specific exceptions
 *
 * @author lemuel
 */
public class PayantException extends RuntimeException {
    public PayantException(String detailMessage) {
        super(detailMessage);
    }

    public PayantException(String detailMessage, Throwable exception) {
        super(detailMessage, exception);
    }
}
