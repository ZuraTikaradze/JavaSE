import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

// SELECT
public class Demo1 {
    public static void main(String[] args) {
        // crt factiry
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        // crt sesion
        Session session = factory.getCurrentSession();

        try {
            // ტრანზაქციის დაწყება
            session.beginTransaction();

            // Query
            List<Person> thisMobileInfos = session.createQuery("from Person").list();

            // ეკრანზე გამოტანა
            for (Person item : thisMobileInfos) {
                System.out.println(item.getAge());
                System.out.println(item.getName());
            }

            //comit
            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            System.out.println("excDemo" + e);

        } finally {
            factory.close();
        }

    }
}
