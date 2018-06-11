package pl.training.helloworld;

import lombok.Data;

import javax.persistence.*;

@Data
@DiscriminatorValue("1")
@Entity
public class BusinessClient extends Client {

    @GeneratedValue
    @Id
    private Long id;

    private String tin; //NIP
}
