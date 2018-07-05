package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model;

/**
 * @author lemuel
 */
public class Client {
    private String id;
    private String company_id;
    private String name;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String website;
    private String address;
    private String type;
    private String settlement_bank;
    private String account_name;
    private String account_number;
    private String status;
    private String created_at;
    private String updated_at;
    private String deleted_at;

    public String getId() {
        return id;
    }

    public String getcompanyId() {
        return company_id;
    }

    public String getName() {
        return name;
    }

    public String getfirstName() {
        return first_name;
    }

    public String getlastName() {
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

    public String getsettlementBank() {
        return settlement_bank;
    }

    public String getaccountName() {
        return account_name;
    }

    public String getaccountNumber() {
        return account_number;
    }

    public String getStatus() {
        return status;
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
