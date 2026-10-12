package demoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveEmployee {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String username = "root";
        String password = "your_password";

        String query = "SELECT * FROM employee";

        try (
            // Step 1: Establish database connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Step 2: Prepare SQL query
            PreparedStatement ps = con.prepareStatement(query);

            // Step 3: Execute query and retrieve records
            ResultSet rs = ps.executeQuery()
        ) {
            // Step 4: Display all employee records
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println("--------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}