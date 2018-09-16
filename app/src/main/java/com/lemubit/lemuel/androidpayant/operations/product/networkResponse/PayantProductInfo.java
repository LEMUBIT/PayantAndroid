package com.lemubit.lemuel.androidpayant.operations.product.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.model.ProductDataWithDeleteDate;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantProductInfo {
    private String status;
    private String message;
    private ProductDataWithDeleteDate data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public ProductDataWithDeleteDate getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantProductInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
