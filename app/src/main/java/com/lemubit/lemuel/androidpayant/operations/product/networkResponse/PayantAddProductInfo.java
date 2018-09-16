package com.lemubit.lemuel.androidpayant.operations.product.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.model.ProductData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantAddProductInfo {
    private String status;
    private String message;
    private ProductData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public ProductData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantAddProductInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
