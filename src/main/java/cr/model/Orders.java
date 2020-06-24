package cr.model;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orders")
    private int idOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    private OrderStatus orderStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    private OrderCategory orderCategory;

    @Column(name = "order_number")
    private int orderNumber;

    @Column(name = "date")
    private Date date;

    @Column(name = "cost")
    private Float cost;

    @Column(name = "cost_iva")
    private Float costIVA;

    public Orders() {
    }

    public Orders(int idOrder, int orderNumber, Date date, Float cost, Float costIVA, OrderStatus orderStatus, OrderCategory orderCategory, Client client) {
        this.idOrder = idOrder;
        this.orderNumber = orderNumber;
        this.date = date;
        this.cost = cost;
        this.costIVA = costIVA;
        this.orderStatus = orderStatus;
        this.orderCategory = orderCategory;
        this.client = client;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderCategory getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(OrderCategory orderCategory) {
        this.orderCategory = orderCategory;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getCostIVA() {
        return costIVA;
    }

    public void setCostIVA(Float costIVA) {
        this.costIVA = costIVA;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "idOrder=" + idOrder +
                ", orderNumber=" + orderNumber +
                ", date=" + date +
                ", cost=" + cost +
                ", costIVA=" + costIVA +
                ", orderStatus=" + orderStatus +
                ", orderCategory=" + orderCategory +
                ", client=" + client +
                '}';
    }
}
