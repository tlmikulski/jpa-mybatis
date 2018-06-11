package pl.training.helloworld;

import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator", discriminatorType = DiscriminatorType.INTEGER)
@EqualsAndHashCode(exclude = "accounts")
@ToString(exclude = "accounts")
@Data
@Entity
public class Client {
    @GeneratedValue
    @Id
    private Long id;

    @ManyToMany(mappedBy = "clients", fetch = FetchType.LAZY)
    private List<Account> accounts = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address primaryAddress;

    @JoinColumn(name = "client_id")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();

    @AttributeOverrides(
            @AttributeOverride(name = "email", column = @Column(name = "user_email"))
    )
    @Embedded
    private Info info;
}
