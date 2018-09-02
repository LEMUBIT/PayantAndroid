package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model;

/**
 * @author lemuel
 */
public class WalletWithdrawData {
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
    private String settlement_bank;
    private String account_number;
    private String account_name;

    public String getcompanyId() {
        return company_id;
    }

    public String getwalletId() {
        return wallet_id;
    }

    public String getwalletReferenceCode() {
        return wallet_reference_code;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }

    public String getreferenceCode() {
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

    public String getdisburseRecipients() {
        return disburse_recipients;
    }

    public String getcreatedAt() {
        return created_at;
    }

    public String getupdatedAt() {
        return updated_at;
    }

    public String getId() {
        return id;
    }

    public String gettransactionDate() {
        return transaction_date;
    }

    public String getpaymentId() {
        return payment_id;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getgatewayResponse() {
        return gateway_response;
    }

    public String getdisburseStatus() {
        return disburse_status;
    }

    public String getdisburseRef() {
        return disburse_ref;
    }

    public String getdisburseResponse() {
        return disburse_response;
    }

    public String getdisburseRecipientsResponse() {
        return disburse_recipients_response;
    }

    public String getsettlementBank() {
        return settlement_bank;
    }

    public String getaccountNumber() {
        return account_number;
    }

    public String getaccountName() {
        return account_name;
    }

    @Override
    public String toString() {
        return "WalletWithdrawData{" +
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
                ", settlement_bank='" + settlement_bank + '\'' +
                ", account_number='" + account_number + '\'' +
                ", account_name='" + account_name + '\'' +
                '}';
    }
}
