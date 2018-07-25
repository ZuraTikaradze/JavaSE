package ge.cu.edu.db.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMain {
    public static void main(String[] args) {
        try {
            // 1. Get a Connection to Database
            String connectionString = "jdbc:sqlserver://localhost:63031;DatabaseName=TESTODB;user=HBG\\ZTikaradze;integratedSecurity=true";
            Connection myConn = DriverManager.getConnection(connectionString);

            // 2. Create Statment
            Statement myStatement = myConn.createStatement();

            // 3. Execute SQL Query
            ResultSet myResultSet = myStatement.executeQuery("select * from person");

            // 4. process the result set
            while (myResultSet.next()) {
                System.out.println(myResultSet.getString("id") + " " + myResultSet.getString("name") + " "+ myResultSet.getString("surname") +" "+ myResultSet.getString("age") );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
