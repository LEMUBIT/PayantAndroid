package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model;

/**
 * @author lemuel
 */
public class WalletTransaction {
    private String company_id;
    private String client_id;
    private String invoice_id;
    private String expense_id;
    private String wallet_id;
    private String payment_id;
    private String transaction_date;
    private String wallet_reference_code;
    private String amount;
    private String currency;
    private String reference_code;
    private String referrer;
    private String gateway_response;
    private String message;
    private String channel;
    private String disburse_status;
    private String disburse_ref;
    private String disburse_response;
    private String settlement_bank;
    private String account_number;
    private String account_name;
    private String type;
    private String status;
    private String created_at;
    private String updated_at;
    private String id;

    public String getCompanyId() {
        return company_id;
    }

    public String getClientId() {
        return client_id;
    }

    public String getInvoiceId() {
        return invoice_id;
    }

    public String getExpenseId() {
        return expense_id;
    }

    public String getWalletId() {
        return wallet_id;
    }

    public String getPaymentId() {
        return payment_id;
    }

    public String getTransactionDate() {
        return transaction_date;
    }

    public String getWalletReferenceCode() {
        return wallet_reference_code;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getReferenceCode() {
        return reference_code;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getGatewayResponse() {
        return gateway_response;
    }

    public String getMessage() {
        return message;
    }

    public String getChannel() {
        return channel;
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

    public String getSettlementBank() {
        return settlement_bank;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public String getAccountName() {
        return account_name;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
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

    @Override
    public String toString() {
        return "WalletTransaction{" +
                "company_id='" + company_id + '\'' +
                ", client_id='" + client_id + '\'' +
                ", invoice_id='" + invoice_id + '\'' +
                ", expense_id='" + expense_id + '\'' +
                ", wallet_id='" + wallet_id + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                ", wallet_reference_code='" + wallet_reference_code + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", reference_code='" + reference_code + '\'' +
                ", referrer='" + referrer + '\'' +
                ", gateway_response='" + gateway_response + '\'' +
                ", message='" + message + '\'' +
                ", channel='" + channel + '\'' +
                ", disburse_status='" + disburse_status + '\'' +
                ", disburse_ref='" + disburse_ref + '\'' +
                ", disburse_response='" + disburse_response + '\'' +
                ", settlement_bank='" + settlement_bank + '\'' +
                ", account_number='" + account_number + '\'' +
                ", account_name='" + account_name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
