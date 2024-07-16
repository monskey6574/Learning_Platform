package com.lms.itresourses.dao;

import com.lms.itresourses.Model.userdata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userDataSave {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/lms_platform_data";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "ayo2002";
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(userDataSave.class.getName()).log(Level.SEVERE, "MySQL Driver not found", e);
        }
    }
    
    public static void saveUser(userdata person) {
        String INSERT_PERSON_SQL = "INSERT INTO user (firstName, lastName, address, gender, dob, email, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pst = con.prepareStatement(INSERT_PERSON_SQL)) {
             
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
            Logger.getLogger(userDataSave.class.getName()).log(Level.SEVERE, "Error saving user data", e);
        }
    }
}
