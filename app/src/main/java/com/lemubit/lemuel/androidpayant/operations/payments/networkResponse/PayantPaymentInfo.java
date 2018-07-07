package com.lemubit.lemuel.androidpayant.operations.payments.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.model.PaymentData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantPaymentInfo {
    private String status;
    private String message;
    private PaymentData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public PaymentData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantPaymentInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
