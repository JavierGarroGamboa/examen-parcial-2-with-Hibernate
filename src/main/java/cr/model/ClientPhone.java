package cr.model;


import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "client_phone")
public class ClientPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client_phone")
    private int idClientPhone;

    @Column(name ="id_client")
    private Long idClient;

    @Column(name ="phone")
    private String phone;

    @Column(name ="type")
    private String type;

    public ClientPhone() {
    }

    public ClientPhone(int idClientPhone, String phone, String type) {
        this.idClientPhone = idClientPhone;
        this.phone = phone;
        this.type = type;
    }

    public ClientPhone(Long idClient) {
        this.idClient = idClient;
    }

    public int getIdClientPhone() {
        return idClientPhone;
    }

    public void setIdClientPhone(int idClientPhone) {
        this.idClientPhone = idClientPhone;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClientPhone{" +
                "idClientPhone=" + idClientPhone +
                ", phone='" + phone +
                ", type='" + type +
                '}';
    }
}
