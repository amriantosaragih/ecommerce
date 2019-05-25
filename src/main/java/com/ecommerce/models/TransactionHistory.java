package com.ecommerce.models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "transaction_history")
public class TransactionHistory implements Serializable {
    @Id
    private String id;
    @Column(name = "user_id")
    private String userID;
    @Column(name = "order_id")
    private String orderID;
    private String status;

    public TransactionHistory() {
    }

    public TransactionHistory(String id, String userID, String orderID, String status) {
        this.id = id;
        this.userID = userID;
        this.orderID = orderID;
        this.status = status;
    }
}
