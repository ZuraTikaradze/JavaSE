package ge.cu.edu.db.demo2;

import java.sql.*;

public class ProcDemo1 {
    public static void main(String[] args) {
        try {
            // 1. Get a Connection to Database
            String connectionString = "jdbc:sqlserver://localhost:63031;DatabaseName=TESTODB;user=HBG\\ZTikaradze;integratedSecurity=true";
            Connection myConn = DriverManager.getConnection(connectionString);

            // 2. Create Statment
            PreparedStatement myPreparedStatement = myConn.prepareCall("{CALL ageFilter(?) }");

            // 3. set parameter
            myPreparedStatement.setInt(1,10);

            // 3. Execute SQL Query
            ResultSet resultSet= myPreparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
