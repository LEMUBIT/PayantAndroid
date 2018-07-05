package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model.HistoryData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * This is the model of the response when invoice history is requested
 * {@code HistoryData} will contain the list of past invoices
 *
 * @author lemuel
 */
public class PayantInvoiceHistoryInfo {
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
        return "PayantInvoiceHistoryInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
