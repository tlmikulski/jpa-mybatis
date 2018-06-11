package pl.training.helloworld;

import javax.persistence.*;
import java.util.Objects;

@TableGenerator(name="Custom_generator",
table="sequence",
pkColumnName = "name",
valueColumnName = "value",allocationSize = 10)
@Table(name="accounts")
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

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance &&
                Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
