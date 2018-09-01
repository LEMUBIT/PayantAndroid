package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantWalletWithdrawInfo {
    private String status;
    private String message;
    private WalletWithdrawData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public WalletWithdrawData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantWalletWithdrawInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
