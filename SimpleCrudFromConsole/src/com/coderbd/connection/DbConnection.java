package com.coderbd.connection;

import com.coderbd.MySqlDbConnection;
import java.sql.Connection;

/**
 *
 * @author Instructor
 */
public class DbConnection {
    static Connection connection = null;
public static Connection getConnections(){
connection = MySqlDbConnection.getConnection("studentdb", "root", "1234");
return connection;

}

}
