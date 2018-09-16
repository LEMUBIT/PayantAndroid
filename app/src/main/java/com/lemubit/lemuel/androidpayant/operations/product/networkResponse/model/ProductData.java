package com.lemubit.lemuel.androidpayant.operations.product.networkResponse.model;

/**
 * @author lemuel
 */
public class ProductData {
    private String company_id;
    private String name;
    private String description;
    private String unit_cost;
    private String type;
    private String image;
    private String status;
    private String created_at;
    private String updated_at;
    private String id;

    public String getCompanyId() {
        return company_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUnitCost() {
        return unit_cost;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
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
        return "ProductData{" +
                "company_id='" + company_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit_cost='" + unit_cost + '\'' +
                ", type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
