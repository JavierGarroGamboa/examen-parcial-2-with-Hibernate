package cr.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_category")
public class OrderCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private int idOrderCategory;

    @Column(name ="category")
    private String category;

    @Column(name ="percentage")
    private Long percentage;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "order_category", nullable = false)
    private List<Orders> ordersList = new ArrayList<>();

    public OrderCategory() {
    }

    public OrderCategory(int idOrderCategory, String category, Long percentage) {
        this.idOrderCategory = idOrderCategory;
        this.category = category;
        this.percentage = percentage;
    }

    public int getIdOrderCategory() {
        return idOrderCategory;
    }

    public void setIdOrderCategory(int idOrderCategory) {
        this.idOrderCategory = idOrderCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getPercentage() {
        return percentage;
    }

    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "OrderCategory{" +
                "idOrderCategory=" + idOrderCategory +
                ", category='" + category +
                ", percentage=" + percentage +
                ", ordersList=" + ordersList +
                '}';
    }
}
