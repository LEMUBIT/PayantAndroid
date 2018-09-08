package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model.WalletTransactionData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class PayantWalletTransactionsInfo {
    private String status;
    private WalletTransactionData data;

    public String getStatus() {
        return status;
    }

    public WalletTransactionData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantWalletTransactionsInfo{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
