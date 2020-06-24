package cr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status")
    private int idOrderStatus;

    @JsonProperty("status")
    private String status;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "order_status", nullable = false)
    private List<Orders> ordersList = new ArrayList<>();

    public OrderStatus() {
    }

    public OrderStatus(int idOrderStatus, String status) {
        this.idOrderStatus = idOrderStatus;
        this.status = status;
    }

    public int getIdOrderStatus() {
        return idOrderStatus;
    }

    public void setIdOrderStatus(int idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "idOrderStatus=" + idOrderStatus +
                ", status='" + status +
                ", ordersList=" + ordersList +
                '}';
    }
}
