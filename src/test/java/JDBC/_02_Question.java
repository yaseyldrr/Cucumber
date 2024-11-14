package JDBC;

import java.sql.*;

public class _02_Question {
    public static void main(String[] args) throws SQLException {
        // city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız

        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement queryScreen = connection.createStatement();

        ResultSet resultSet = queryScreen.executeQuery("select * from city;");

        while (resultSet.next()) // olduğu sürece devam et
            System.out.println(resultSet.getNString("city"));


        connection.close();
    }
}
