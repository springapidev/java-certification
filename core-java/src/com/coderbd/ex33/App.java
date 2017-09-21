package com.coderbd.ex33;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author  Mohammad Rajaul Islam
 */
public class App {
    public static void main(String[] args) {
        Connection con = DbConnection.getConnection("xe","hr","hr");
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
