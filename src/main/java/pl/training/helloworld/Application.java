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

        Account account = new Account();
        account.setId(1L);
        account.setNumber("0000000001");
        account.setBalance(1_000);

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
