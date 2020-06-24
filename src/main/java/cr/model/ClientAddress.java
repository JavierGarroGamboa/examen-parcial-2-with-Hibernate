package cr.model;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "client_address")
public class ClientAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client_address")
    private int idClientAddress;

    @Column(name ="id_client")
    private Long idClient;

    @Column(name ="address")
    private String address;

    @Column(name ="type")
    private String type;

    public ClientAddress() {
    }

    public ClientAddress(int idClientAddress, String address, String type) {
        this.idClientAddress = idClientAddress;
        this.address = address;
        this.type = type;
    }

    public ClientAddress(Long idClient) {
        this.idClient = idClient;
    }

    public int getIdClientAddress() {
        return idClientAddress;
    }

    public void setIdClientAddress(int idClientAddress) {
        this.idClientAddress = idClientAddress;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClientAddress{" +
                "idClientAddress=" + idClientAddress +
                ", address='" + address +
                ", type='" + type +
                '}';
    }
}
