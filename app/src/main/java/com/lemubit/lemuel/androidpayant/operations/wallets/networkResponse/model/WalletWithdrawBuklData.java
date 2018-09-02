package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model;

public class WalletWithdrawBuklData {
    private String company_id;
    private String wallet_id;
    private String wallet_reference_code;
    private String currency;
    private String amount;
    private String reference_code;
    private String type;
    private String channel;
    private String status;
    private String disburse_recipients;
    private String created_at;
    private String updated_at;
    private String id;
    private String transaction_date;
    private String payment_id;
    private String referrer;
    private String gateway_response;
    private String disburse_status;
    private String disburse_ref;
    private String disburse_response;
    private String disburse_recipients_response;

    public String getCompanyId() {
        return company_id;
    }

    public String getWalletId() {
        return wallet_id;
    }

    public String getWalletReferenceCode() {
        return wallet_reference_code;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }

    public String getReferenceCode() {
        return reference_code;
    }

    public String getType() {
        return type;
    }

    public String getChannel() {
        return channel;
    }

    public String getStatus() {
        return status;
    }

    public String getDisburseRecipients() {
        return disburse_recipients;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public String getId() {
        return id;
    }

    public String getTransactionDate() {
        return transaction_date;
    }

    public String getPaymentId() {
        return payment_id;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getGatewayResponse() {
        return gateway_response;
    }

    public String getDisburseStatus() {
        return disburse_status;
    }

    public String getDisburseRef() {
        return disburse_ref;
    }

    public String getDisburseResponse() {
        return disburse_response;
    }

    public String getDisburseRecipientsResponse() {
        return disburse_recipients_response;
    }

    @Override
    public String toString() {
        return "WalletWithdrawBuklData{" +
                "company_id='" + company_id + '\'' +
                ", wallet_id='" + wallet_id + '\'' +
                ", wallet_reference_code='" + wallet_reference_code + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", reference_code='" + reference_code + '\'' +
                ", type='" + type + '\'' +
                ", channel='" + channel + '\'' +
                ", status='" + status + '\'' +
                ", disburse_recipients='" + disburse_recipients + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", id='" + id + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", referrer='" + referrer + '\'' +
                ", gateway_response='" + gateway_response + '\'' +
                ", disburse_status='" + disburse_status + '\'' +
                ", disburse_ref='" + disburse_ref + '\'' +
                ", disburse_response='" + disburse_response + '\'' +
                ", disburse_recipients_response='" + disburse_recipients_response + '\'' +
                '}';
    }
}
