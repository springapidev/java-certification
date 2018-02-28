package com.coderbd.day26.db5;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// To illustrate how we can update a database 
class DbUpdate { 
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb(); 
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"Michael\"")) { 
                // first fetch the data and display it before the update operation 
                System.out.println("Before the update");
                System.out.println("id \tfName \tlName \temail \t\tphoneNo");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + "\t" 
                                        + resultSet.getString("firstName") + "\t" 
                                        + resultSet.getString("lastName") + "\t" 
                                        + resultSet.getString("email") + "\t" 
                                        + resultSet.getString("phoneNo"));
                }
                // now update the resultset and display the modified data 
                resultSet.absolute(1);
                resultSet.updateString("phoneNo", "+919976543210");
                System.out.println("After the update");
                System.out.println("id \tfName \tlName \temail \t\tphoneNo");
                resultSet.beforeFirst();
                while (resultSet.next()) {
                        System.out.println(resultSet.getInt("id") + "\t" 
                                        + resultSet.getString("firstName") + "\t" 
                                        + resultSet.getString("lastName") + "\t" 
                                        + resultSet.getString("email") + "\t" 
                                        + resultSet.getString("phoneNo"));
                }
           } catch (SQLException e) {
                e.printStackTrace();
                System.exit(-1); 
           }
     }
}
