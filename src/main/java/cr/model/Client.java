package cr.model;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long idClient;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "iva")
    private boolean iva;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "id_client")
    private List<ClientAddress> clientAddresses;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "id_client")
    private List<ClientPhone> clientPhones;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "client", nullable = false)
    private List<Orders> ordersList = new ArrayList<>();

    public Client() {
    }

    public Client(Long idClient) {
    }

    public Client(Long idClient, String name, String lastName, boolean iva, List<ClientAddress> clientAddresses, List<ClientPhone> clientPhones) {
        this.idClient = idClient;
        this.name = name;
        this.lastName = lastName;
        this.iva = iva;
        this.clientAddresses = clientAddresses;
        this.clientPhones = clientPhones;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public List<ClientAddress> getClientAddresses() {
        return clientAddresses;
    }

    public void setClientAddresses(List<ClientAddress> clientAddresses) {
        this.clientAddresses = clientAddresses;
    }

    public List<ClientPhone> getClientPhones() {
        return clientPhones;
    }

    public void setClientPhones(List<ClientPhone> clientPhones) {
        this.clientPhones = clientPhones;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name +
                ", lastName='" + lastName +
                ", iva=" + iva +
                ", clientAddresses=" + clientAddresses +
                ", clientPhones=" + clientPhones +
                ", ordersList=" + ordersList +
                '}';
    }
}
