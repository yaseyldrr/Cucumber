package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    private static Connection connection;
    public static Statement statement;

    public static List<List<String>> getListData(String query) {
        DBConnectionOpen();

        List<List<String>> table = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    row.add(rs.getString(i)); // satırları doldur

                table.add(row); //ana tabloya ekle
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        DBConnectionClose();
        return table;
    }


    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
