package pl.training.helloworld;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Address {

    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "base_info")
    private String baseInfo;

    @Column(name = "postal_code")
    private String postalCode;

    private String city;

    private String country;
}
