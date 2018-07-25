import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo4 {
    public static void main(String[] args) {

        // crt factiry
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        // სესია
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            // მობილურის ობიექტის შექმნა
            int personID=10;
            Person myPerson=session.get(Person.class,personID);

           session.delete(myPerson);

            session.getTransaction().commit();
            System.out.println("Deleted!!!");

        } catch (Exception e) {
            System.out.println("excDemo" + e);

        } finally {
            factory.close();
        }


    }
}