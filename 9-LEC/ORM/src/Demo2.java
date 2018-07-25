import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo2 {
    public static void main(String[] args) {

        // crt factiry
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        // სესია
        Session session = factory.getCurrentSession();

        try {
            // მობილურის ობიექტის შექმნა
            Person person = new Person(10,"Jhon","Doe",10);

            // ტრანზაქციის დაწყება
            session.beginTransaction();

            // ობიექტის შენახვა ბაზაში
            session.save(person);

            //comit
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("excDemo" + e);

        } finally {
            factory.close();
        }


    }
}