package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {

    private static Connection connection;
    public static Statement statement;

    public static void DBCoonectionOpen(){
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";
        try {

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void DBConnectionClose() {
        try {

            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
