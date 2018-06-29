package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

public class Item {
    private String id;
    private String company_id;
    private String client_id;
    private String name;
    private String description;
    private String quantity;
    private String unit_cost;
    private String status;
    private String due_date;
    private String created_at;
    private String updated_at;
    private String deleted_at;

    public String getId() {
        return id;
    }

    public String getcompanyId() {
        return company_id;
    }

    public String getclientId() {
        return client_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getunitCost() {
        return unit_cost;
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

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", client_id='" + client_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unit_cost='" + unit_cost + '\'' +
                ", status='" + status + '\'' +
                ", due_date='" + due_date + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                '}';
    }
}
