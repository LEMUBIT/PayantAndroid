package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model.WalletData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantWalletInfo {
    private String status;
    private String message;
    private WalletData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public WalletData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantWalletInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
