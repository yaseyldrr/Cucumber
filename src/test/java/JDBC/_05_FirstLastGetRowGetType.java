package JDBC;

import org.openqa.selenium.devtools.v127.preload.model.RuleSet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowGetType extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("select city from city;");

        rs.last(); // son satıra götürür
        System.out.println("Last Row: " + rs.getNString(1));
        int whichRow = rs.getRow(); // Kayıt sayısını verir
        System.out.println("Which row im at? " + whichRow);

        rs.first();
        System.out.println("First Row: " + rs.getNString(1)); // son satır
        whichRow = rs.getRow();
        System.out.println("Which row im at? " + whichRow);


        DBConnectionClose();

    }
}
