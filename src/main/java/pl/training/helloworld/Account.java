package pl.training.helloworld;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Account {
    @GeneratedValue
    @Id
    private Long id;

    @NonNull
    @Column(name="account_number", length = 26, unique = true)
    private String number;

    private long balance;

    @Enumerated(EnumType.ORDINAL)
    private AccountType type;

    @Temporal(TemporalType.DATE)
    private Date created;

    @ManyToMany
    private List<Client> clients = new ArrayList<>();
}
