package pl.training.helloworld;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@DiscriminatorValue("1")
@Entity
public class BusinessClient extends Client {

    @PrimaryKeyJoinColumn
    private Long id;

    private String tin; //NIP
}
