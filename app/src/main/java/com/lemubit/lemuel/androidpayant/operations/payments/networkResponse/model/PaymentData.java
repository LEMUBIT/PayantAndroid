package com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.model;

import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model.Client;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model.InvoiceData;

/**
 * @author lemuel
 */
public class PaymentData {
    private String company_id;
    private String client_id;
    private String invoice_id;
    private String expense_id;
    private String amount;
    private String currency;
    private String transaction_date;
    private String status;
    private String reference_code;
    private String payment_id;
    private String referrer;
    private String gateway_response;
    private String message;
    private String channel;
    private String type;
    private String created_at;
    private String updated_at;
    private String id;
    private InvoiceData invoice;
    private Client client;


    public String getcompanyId() {
        return company_id;
    }

    public String getclientId() {
        return client_id;
    }

    public String getinvoiceId() {
        return invoice_id;
    }

    public String getexpenseId() {
        return expense_id;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String gettransactionDate() {
        return transaction_date;
    }

    public String getStatus() {
        return status;
    }

    public String getreferenceCode() {
        return reference_code;
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

    public String getMessage() {
        return message;
    }

    public String getChannel() {
        return channel;
    }

    public String getType() {
        return type;
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

    public InvoiceData getInvoice() {
        return invoice;
    }

    public Client getClient() {
        return client;
    }


    @Override
    public String toString() {
        return "PaymentData{" +
                "company_id='" + company_id + '\'' +
                ", client_id='" + client_id + '\'' +
                ", invoice_id='" + invoice_id + '\'' +
                ", expense_id='" + expense_id + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                ", status='" + status + '\'' +
                ", reference_code='" + reference_code + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", referrer='" + referrer + '\'' +
                ", gateway_response='" + gateway_response + '\'' +
                ", message='" + message + '\'' +
                ", channel='" + channel + '\'' +
                ", type='" + type + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", id='" + id + '\'' +
                ", client=" + client +
                ", invoice=" + invoice +
                '}';
    }
}
