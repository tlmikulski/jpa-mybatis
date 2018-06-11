package pl.training.helloworld;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Account {
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Custom_generator")
    @Id
    private Long id;
    @Column(name="account_number", length = 26, unique = true)
    private String number;
    private long balance;
    @Enumerated(EnumType.ORDINAL)
    private AccountType type;
}
