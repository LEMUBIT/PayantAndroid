package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

public class Client {
    String id;
    String company_id;
    String name;
    String first_name;
    String last_name;
    String email;
    String phone;
    String website;
    String address;
    String type;
    String settlement_bank;
    String account_name;
    String account_number;
    String status;
    String created_at;
    String updated_at;
    String deleted_at;

    public String getId() {
        return id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getSettlement_bank() {
        return settlement_bank;
    }

    public String getAccount_name() {
        return account_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", settlement_bank='" + settlement_bank + '\'' +
                ", account_name='" + account_name + '\'' +
                ", account_number='" + account_number + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                '}';
    }
}
