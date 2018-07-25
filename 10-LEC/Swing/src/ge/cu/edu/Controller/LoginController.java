package ge.cu.edu.Controller;

import ge.cu.edu.Model.AppUser;
import ge.cu.edu.Model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

// SELECT
public class LoginController {
    public static boolean chackAccount(String username, String password) {
        boolean flag=false;
        // crt factiry
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(AppUser.class)
                .buildSessionFactory();

        // crt sesion
        Session session = factory.getCurrentSession();

        try {
            // ტრანზაქციის დაწყება
            session.beginTransaction();

            // Query
            List<AppUser> thisMobileInfos = session.createQuery("from AppUser").list();

            // ეკრანზე გამოტანა
            for (AppUser item : thisMobileInfos) {
                if(item.getUsername().equals(username) && item.getPassword().equals(password)){

                    System.out.println("************"+item.getUsername());
                    System.out.println("************"+item.getPassword());
                    flag=true;
                }
            }

            //comit
            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            System.out.println("excDemo" + e);

        } finally {
            factory.close();
        }

        return flag;
    }
}
