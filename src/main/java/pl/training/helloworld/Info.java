package pl.training.helloworld;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Info {
    private String email;
    private String phone;
}
