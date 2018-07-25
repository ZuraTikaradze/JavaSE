package ge.cu.edu.db.demo1;

import java.sql.*;

public class PreparedStatmentsMain {
    public static void main(String[] args) throws SQLException {
        // 1. Get a Connection to Database
        String connectionString = "jdbc:sqlserver://localhost:63031;DatabaseName=TESTODB;user=HBG\\ZTikaradze;integratedSecurity=true";
        Connection myConn = DriverManager.getConnection(connectionString);

        // 2. Prepare Statment
        PreparedStatement preparedStatement = myConn.prepareStatement("SELECT * FROM  Person WHERE age<?");

        // tu washla gvinda "DELETE FROM Person WHERE name=? and age > ?"
        //  preparedStatement.setInt(1, "Donald");  preparedStatement.setInt(2, 16);

        // 3. set the parameter
        preparedStatement.setInt(1, 16);

        // 4. Execute sql query
        ResultSet resultSet = preparedStatement.executeQuery();

        // display
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
