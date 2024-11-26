package JDBC;

import java.sql.*;

public class _01_Intro {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        // 1- Bağlantı bilgilerini girdik, DB Server a bağlandık
        Connection connection = DriverManager.getConnection(url, username, password);

        // 2- Sorgu ekranını açtık
        Statement queryScreen = connection.createStatement();

        // 3- Sorguyu yaz, tablo gelir
        ResultSet resultSet = queryScreen.executeQuery("select * from customer;");
        // 4- next dedikçe sıradan devam eder ilk next ilk sıra (1 numara)
        resultSet.next();
        String fname = resultSet.getNString("first_name");
        String lname = resultSet.getNString("last_name");

        System.out.println("1. Row: " + fname + " " + lname);

        resultSet.next();
        fname = resultSet.getNString("first_name");
        lname = resultSet.getNString("last_name");
        System.out.println("2. Row: " + fname + " " + lname);


        connection.close();

    }

}
