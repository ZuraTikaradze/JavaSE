package ge.cu.edu.db.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatment2Main {
    public static void main(String[] args) {
        String constr = "jdbc:sqlserver://localhost:63031;DatabaseName=TESTODB;user=HBG\\ZTikaradze;integratedSecurity=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connecting ...");
            Connection connection = DriverManager.getConnection(constr);
            System.out.println("Success !!! ");
            // dakavshirda warmatebit
            // exla logika
            String sqlInsert = "INSERT INTO Person (id, name, surname, age) VALUES (?, ?, ?, ?)";
            PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
            statementInsert.setString(1,"4");
            statementInsert.setString(2,"Donald");
            statementInsert.setString(3,"Trump");
            statementInsert.setString(4,"57");
           // https://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html#executeUpdate()
            System.out.println("DB Updated");
        } catch (Exception e) {
            System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
    }
}
