package pl.training.helloworld;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bank");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Account account = new Account();
        account.setNumber("0000000001");
        account.setBalance(1_000);
        account.setType(AccountType.STANDARD);
        entityManager.persist(account);

        transaction.commit();

        Account readAccount = entityManager.find(Account.class, 1L);
        System.out.print(readAccount.toString());

        entityManager.close();
        entityManagerFactory.close();
    }
}
