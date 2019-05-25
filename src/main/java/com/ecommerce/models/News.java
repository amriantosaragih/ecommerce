package com.ecommerce.models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class News implements Serializable {
    @Id
    private String id;
    private String title;
    @Column(name = "body")
    private String newsBody;
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

    public News() {
    }

    public News(String id, String title, String newsBody, Date startDate, Date endDate, boolean isActive,
                Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.newsBody = newsBody;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
