package assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlconn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; 
        String user = "root"; 
        String password = "Anu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL database successfully.");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}


