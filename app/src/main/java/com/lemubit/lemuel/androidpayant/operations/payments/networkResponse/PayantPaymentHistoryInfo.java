package com.lemubit.lemuel.androidpayant.operations.payments.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.model.HistoryData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantPaymentHistoryInfo {
    private String status;
    private String message;
    private HistoryData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public HistoryData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantPaymentHistoryInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
