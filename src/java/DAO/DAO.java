package DAO;

import Model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/lms_platform_data";
    private String user = "root";  // Your database username
    private String password = "ayo2002"; 
    
    private static final String INSERT_PERSON_SQL = "INSERT INTO user (firstName, lastName, address, gender, dob, email, password) VALUES (?, ?, ?, ?, ?, ?, ?);";
    
    protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    // Insert data
    public void saveUser(Person person) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = getConnection();
            pst = con.prepareStatement(INSERT_PERSON_SQL);
            
            pst.setString(1, person.getFname());
            pst.setString(2, person.getLname());
            pst.setString(3, person.getAddresse());
            pst.setString(4, person.getGender());
            pst.setString(5, person.getDob());
            pst.setString(6, person.getEmail());
            pst.setString(7, person.getPwd());
            
            pst.executeUpdate();
            System.out.println("Data entered successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Data entry problem");
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
