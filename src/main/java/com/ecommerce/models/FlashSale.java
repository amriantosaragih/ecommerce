package com.ecommerce.models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "flash_sale")
public class FlashSale implements Serializable {
    @Id
    private String id;
    @Column(name = "promo_id")
    private String promoID;
    @Column(name = "product_id")
    private String productID;
    private String name;
    private String description;
    private int quantity;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public FlashSale() {
    }

    public FlashSale(String id, String promoID, String productID, String name, String description, int quantity,
                     Date startDate, Date endDate, boolean isActive, Date createdAt, Date updatedAt) {
        this.id = id;
        this.promoID = promoID;
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
