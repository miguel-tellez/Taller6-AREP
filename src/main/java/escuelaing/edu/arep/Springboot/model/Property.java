package escuelaing.edu.arep.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private Double price;
    private int size;
    private String description;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public Long setId() {
        return id;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public Double setPrice(Double price) {
        return this.price = price;
    }

    public int setSize(int size) {
        return this.size = size;
    }

    public String setDescription(String description) {
        return this.description = description;
    }
}
