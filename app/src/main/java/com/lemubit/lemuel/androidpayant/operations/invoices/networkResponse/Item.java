package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

public class Item {
    String id;
    String company_id;
    String client_id;
    String name;
    String description;
    String quantity;
    String unit_cost;
    String status;
    String due_date;
    String created_at;
    String updated_at;
    String deleted_at;

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
