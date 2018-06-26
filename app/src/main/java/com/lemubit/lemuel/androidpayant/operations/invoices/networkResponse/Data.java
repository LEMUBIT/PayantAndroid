package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

import java.util.List;

public class Data {
    String id;
    String company_id;
    String client_id;
    String reference_code;
    String payment_id;
    String fee_bearer;
    String mail_status;
    String status;
    String due_date;
    String created_at;
    String updated_at;
    String deleted_at;
    Client client;
    List<Item> items;

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
