package pl.training.helloworld;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bank");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

//        Account account = new Account();
//        account.setNumber("0000000001");
//        account.setBalance(1_000);
//        account.setType(AccountType.STANDARD);
//        account.setCreated(new Date());
//        entityManager.persist(account);
//
//        Client client = new Client();
//
//        Info info = new Info();
//        info.setEmail("user@example.org");
//        info.setPhone("123456789");
//        client.setInfo(info);
//
//        Address address = new Address();
//        address.setBaseInfo("ul. Testowa");
//        address.setPostalCode("05-400");
//        address.setCity("Wwa");
//        address.setCountry("EN");
//
//        client.getAddresses().add(address);
//        client.getAccounts().add(account);
//        account.getClients().add(client);
//
//        entityManager.persist(client);


//        Account readAccount = entityManager.find(Account.class, 1L);
        Client readClient = entityManager.find(Client.class, 2L);
        System.out.println("Loaded");
//        System.out.println(readAccount);

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
