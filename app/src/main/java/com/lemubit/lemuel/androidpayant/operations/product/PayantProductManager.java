package com.lemubit.lemuel.androidpayant.operations.product;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.OperationStatus;
import com.lemubit.lemuel.androidpayant.operations.product.model.PayantProduct;
import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.PayantAddProductInfo;
import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.PayantProductInfo;
import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.PayantProductInfoList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author lemuel
 */
public class PayantProductManager {
    private static PayantApiService payantApiService = new PayantApiClient().getPayantApiService();

    /**
     * @param payantProduct          Payant product object containing information of product to be added
     * @param onProductAddedListener Listens for network call response
     */
    public static void addPayantProduct(PayantProduct payantProduct, final OnProductAddedListener onProductAddedListener) {
        Call<PayantAddProductInfo> payantAddProductInfoCall = payantApiService.addNewProduct(Headers.contentType(), Headers.authorization(), payantProduct);
        payantAddProductInfoCall.enqueue(new Callback<PayantAddProductInfo>() {
            @Override
            public void onResponse(Call<PayantAddProductInfo> call, Response<PayantAddProductInfo> response) {
                if (response.isSuccessful()) {
                    onProductAddedListener.onManagerResponse(response.body());
                } else {
                    onProductAddedListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantAddProductInfo> call, Throwable t) {
                onProductAddedListener.onFailure(t);
            }
        });
    }

    /**
     * @param productID                  unique ID of product
     * @param onGetPayantProductListener Listens for network call response
     */
    public static void getProduct(String productID, final OnGetPayantProductListener onGetPayantProductListener) {
        Call<PayantProductInfo> payantAddProductInfoWIthDeleteDateCall = payantApiService.getProduct(Headers.contentType(), Headers.authorization(), productID);

        payantAddProductInfoWIthDeleteDateCall.enqueue(new Callback<PayantProductInfo>() {
            @Override
            public void onResponse(Call<PayantProductInfo> call, Response<PayantProductInfo> response) {
                if (response.isSuccessful()) {
                    onGetPayantProductListener.onManagerResponse(response.body());
                } else {
                    onGetPayantProductListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantProductInfo> call, Throwable t) {
                onGetPayantProductListener.onFailure(t);
            }
        });
    }

    /**
     * @param productID                   unique ID of product
     * @param payantProduct               Payant product object containing new information of product to be edited
     * @param onEditPayantProductListener Listens for network call response
     */
    public static void editProduct(String productID, PayantProduct payantProduct, final OnEditPayantProductListener onEditPayantProductListener) {
        Call<PayantAddProductInfo> payantEditProductInfoCall = payantApiService.editProduct(Headers.contentType(), Headers.authorization(), productID, payantProduct);
        payantEditProductInfoCall.enqueue(new Callback<PayantAddProductInfo>() {
            @Override
            public void onResponse(Call<PayantAddProductInfo> call, Response<PayantAddProductInfo> response) {
                if (response.isSuccessful()) {
                    onEditPayantProductListener.onManagerResponse(response.body());
                } else {
                    onEditPayantProductListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantAddProductInfo> call, Throwable t) {
                onEditPayantProductListener.onFailure(t);
            }
        });
    }

    /**
     * @param onGetAllPayantProductsListener Listens for network call response
     */
    public static void getProducts(final OnGetAllPayantProductsListener onGetAllPayantProductsListener) {
        Call<PayantProductInfoList> payantGetAllProductsInfoCall = payantApiService.getAllProduct(Headers.contentType(), Headers.authorization());

        payantGetAllProductsInfoCall.enqueue(new Callback<PayantProductInfoList>() {
            @Override
            public void onResponse(Call<PayantProductInfoList> call, Response<PayantProductInfoList> response) {
                if (response.isSuccessful()) {
                    onGetAllPayantProductsListener.onManagerResponse(response.body());
                } else {
                    onGetAllPayantProductsListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantProductInfoList> call, Throwable t) {
                onGetAllPayantProductsListener.onFailure(t);
            }
        });
    }

    public static void deleteProduct(String productID, final OnDeletePayantProductListener onDeletePayantProductListener) {
        Call<OperationStatus> operationStatusCall = payantApiService.deleteProduct(Headers.contentType(), Headers.authorization(), productID);

        operationStatusCall.enqueue(new Callback<OperationStatus>() {
            @Override
            public void onResponse(Call<OperationStatus> call, Response<OperationStatus> response) {
                if (response.isSuccessful()) {
                    onDeletePayantProductListener.onManagerResponse(response.body());
                } else {
                    onDeletePayantProductListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<OperationStatus> call, Throwable t) {
                onDeletePayantProductListener.onFailure(t);
            }
        });

    }

    public interface OnProductAddedListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantAddProductInfo.isSuccessful()} to confirm.
         *
         * @param payantAddProductInfo Contains information of added Product
         */
        void onManagerResponse(PayantAddProductInfo payantAddProductInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantProductListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantProductInfo.isSuccessful()} to confirm.
         *
         * @param payantProductInfo Contains information of Product
         */
        void onManagerResponse(PayantProductInfo payantProductInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnEditPayantProductListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantAddProductInfo.isSuccessful()} to confirm.
         *
         * @param payantAddProductInfo Contains information of edited Product
         */
        void onManagerResponse(PayantAddProductInfo payantAddProductInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetAllPayantProductsListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantProductInfoList.isSuccessful()} to confirm.
         *
         * @param payantProductInfoList Contains information of Products
         */
        void onManagerResponse(PayantProductInfoList payantProductInfoList);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnDeletePayantProductListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code OperationStatus.isSuccessful()} to confirm.
         *
         * @param operationStatus Contains information about operation
         */
        void onManagerResponse(OperationStatus operationStatus);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }
}
