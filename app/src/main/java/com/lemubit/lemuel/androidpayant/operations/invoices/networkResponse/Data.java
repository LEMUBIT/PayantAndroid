package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

import java.util.List;

/**
 * @author lemuel
 */
public class Data {
    private String id;
    private String company_id;
    private String client_id;
    private String reference_code;
    private String payment_id;
    private String fee_bearer;
    private String mail_status;
    private String status;
    private String due_date;
    private String created_at;
    private String updated_at;
    private String deleted_at;
    private Client client;
    private List<Item> items;

    public String getId() {
        return id;
    }

    public String getcompanyId() {
        return company_id;
    }

    public String getclientId() {
        return client_id;
    }

    public String getreferenceCode() {
        return reference_code;
    }

    public String getpaymentId() {
        return payment_id;
    }

    public String getfeeBearer() {
        return fee_bearer;
    }

    public String getmailStatus() {
        return mail_status;
    }

    public String getStatus() {
        return status;
    }

    public String getdueDate() {
        return due_date;
    }

    public String getcreatedAt() {
        return created_at;
    }

    public String getupdatedAt() {
        return updated_at;
    }

    public String getdeletedAt() {
        return deleted_at;
    }

    public Client getClient() {
        return client;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", client_id='" + client_id + '\'' +
                ", reference_code='" + reference_code + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", fee_bearer='" + fee_bearer + '\'' +
                ", mail_status='" + mail_status + '\'' +
                ", status='" + status + '\'' +
                ", due_date='" + due_date + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                ", client=" + client +
                ", items=" + items +
                '}';
    }
}
