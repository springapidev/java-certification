package com.coderbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class MySqlDbConnection {
    
    private static final String HOST = "jdbc:mysql://localhost:3306";
    
    private static Connection conn = null;

    public static Connection getConnection(String dbName, String userName, String password) {
        String URL = HOST + "/" + dbName;
        try {
            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
