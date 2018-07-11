package com.lemubit.lemuel.androidpayant.operations.wallets;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.OperationStatus;
import com.lemubit.lemuel.androidpayant.operations.wallets.model.PassCodes;
import com.lemubit.lemuel.androidpayant.operations.wallets.model.PayantWallet;
import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.PayantWalletInfo;
import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.PayantWalletInfoList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author lemuel
 */
public class PayantWalletManager {
    private static PayantApiService payantApiService = new PayantApiClient().getPayantApiService();

    /**
     * Add new wallet using information found in {@code payantWallet}
     *
     * @param payantWallet                 Payant wallet object containing information to be added
     * @param onAddNewPayantWalletListener Listens for network call response.
     */
    public static void addPayantWallet(PayantWallet payantWallet, final OnAddNewPayantWalletListener onAddNewPayantWalletListener) {
        Call<PayantWalletInfo> payantWalletInfoCall = payantApiService.addWallet(Headers.contentType(), Headers.authorization(), payantWallet);

        payantWalletInfoCall.enqueue(new Callback<PayantWalletInfo>() {
            @Override
            public void onResponse(Call<PayantWalletInfo> call, Response<PayantWalletInfo> response) {
                if (response.isSuccessful()) {
                    onAddNewPayantWalletListener.onManagerResponse(response.body());
                } else {
                    onAddNewPayantWalletListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantWalletInfo> call, Throwable t) {
                onAddNewPayantWalletListener.onFailure(t);
            }
        });
    }


    /**
     * Get wallet information using provided wallet reference code
     *
     * @param walletReferenceCode       Reference code of desired wallet
     * @param onGetPayantWalletListener Listens for network call response.
     */
    public static void getPayantWallet(String walletReferenceCode, final OnGetPayantWalletListener onGetPayantWalletListener) {
        Call<PayantWalletInfo> payantWalletInfoCall = payantApiService.getWallet(Headers.contentType(), Headers.authorization(), walletReferenceCode);

        payantWalletInfoCall.enqueue(new Callback<PayantWalletInfo>() {
            @Override
            public void onResponse(Call<PayantWalletInfo> call, Response<PayantWalletInfo> response) {
                if (response.isSuccessful()) {
                    onGetPayantWalletListener.onManagerResponse(response.body());
                } else {
                    onGetPayantWalletListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantWalletInfo> call, Throwable t) {
                onGetPayantWalletListener.onFailure(t);
            }
        });

    }

    /**
     * Change passcode of wallet with reference code {@code walletReferenceCode} to passcode found in {@code passCodes}
     *
     * @param walletReferenceCode            Reference code of desired wall
     * @param passCodes                      Contains old and new desired passcodes
     * @param onChangeWalletPassCodeListener Listens for network call response.
     */
    public static void changeWalletPassCode(String walletReferenceCode, PassCodes passCodes, final OnChangeWalletPassCodeListener onChangeWalletPassCodeListener) {
        Call<OperationStatus> operationStatusCall = payantApiService.changeWalletPassCode(Headers.contentType(), Headers.authorization(), walletReferenceCode, passCodes);
        operationStatusCall.enqueue(new Callback<OperationStatus>() {
            @Override
            public void onResponse(Call<OperationStatus> call, Response<OperationStatus> response) {
                if (response.isSuccessful()) {
                    onChangeWalletPassCodeListener.onManagerResponse(response.body());
                } else {
                    onChangeWalletPassCodeListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<OperationStatus> call, Throwable t) {
                onChangeWalletPassCodeListener.onFailure(t);
            }
        });
    }


    /**
     * Get list of available wallets
     *
     * @param onGetPayantWalletsListListener Listens for network call response.
     */
    public static void getPayantWalletList(final OnGetPayantWalletsListListener onGetPayantWalletsListListener) {
        Call<PayantWalletInfoList> payantWalletInfoListCall = payantApiService.getWallets(Headers.contentType(), Headers.authorization());

        payantWalletInfoListCall.enqueue(new Callback<PayantWalletInfoList>() {
            @Override
            public void onResponse(Call<PayantWalletInfoList> call, Response<PayantWalletInfoList> response) {
                if (response.isSuccessful()) {
                    onGetPayantWalletsListListener.onManagerResponse(response.body());
                } else {
                    onGetPayantWalletsListListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantWalletInfoList> call, Throwable t) {
                onGetPayantWalletsListListener.onFailure(t);
            }
        });
    }

    public interface OnAddNewPayantWalletListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantWalletInfo.isSuccessful()} to confirm.
         *
         * @param payantWalletInfo Contains information of added wallet
         */
        void onManagerResponse(PayantWalletInfo payantWalletInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantWalletListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantWalletInfo.isSuccessful()} to confirm.
         *
         * @param payantWalletInfo Contains information of requested wallet
         */
        void onManagerResponse(PayantWalletInfo payantWalletInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnChangeWalletPassCodeListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code OperationStatus.isSuccessful()} to confirm.
         *
         * @param operationStatus Contains information of operation status and message
         */
        void onManagerResponse(OperationStatus operationStatus);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantWalletsListListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantWalletInfoList.isSuccessful()} to confirm.
         *
         * @param payantWalletInfoList Contains information of requested wallet
         */
        void onManagerResponse(PayantWalletInfoList payantWalletInfoList);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }
}
