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
        account.setId(2L);
        account.setNumber("0000000002");
        account.setBalance(2_000);
        entityManager.persist(account);

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
