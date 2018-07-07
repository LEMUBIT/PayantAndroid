package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model.InvoiceDataAndClient;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * This is the model of the response for Invoice operations such as adding invoice or getting invoice information.
 *
 * @author lemuel
 */
public class PayantInvoiceInfo {
    private String status;
    private String message;
    private InvoiceDataAndClient data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public InvoiceDataAndClient getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantInvoiceInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
