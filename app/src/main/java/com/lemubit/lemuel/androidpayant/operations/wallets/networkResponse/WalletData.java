package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

/**
 * @author lemuel
 */
public class WalletData {
    private String company_id;
    private String name;
    private String balance;
    private String currency;
    private String status;
    private String reference_code;
    private String created_at;
    private String updated_at;
    private String id;

    public String getcompanyId() {
        return company_id;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }

    public String getreferenceCode() {
        return reference_code;
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

    @Override
    public String toString() {
        return "WalletData{" +
                "company_id='" + company_id + '\'' +
                ", name='" + name + '\'' +
                ", balance='" + balance + '\'' +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", reference_code='" + reference_code + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
