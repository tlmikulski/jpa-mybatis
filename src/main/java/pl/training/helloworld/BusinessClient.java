package pl.training.helloworld;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@DiscriminatorValue("1")
@Entity
public class BusinessClient extends Client {
    private String tin; //NIP
}
