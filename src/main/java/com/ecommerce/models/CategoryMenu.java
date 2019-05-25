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
@Table(name = "category_menu")
public class CategoryMenu implements Serializable {
    @Id
    private int id;
    @Column(name = "role_id")
    private int roleID;
    @Column(name = "name")
    private String moduleName;
    private String description;
    @Column(name = "order_section")
    private int moduleOrder;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public CategoryMenu() {
    }

    public CategoryMenu(String moduleName, int moduleOrder) {
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }

    public CategoryMenu(int id, int roleID, String moduleName, String description, int moduleOrder, Date createdAt,
                        Date updatedAt) {
        this.id = id;
        this.roleID = roleID;
        this.moduleName = moduleName;
        this.description = description;
        this.moduleOrder = moduleOrder;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
