package JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _09_GetMetaData extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("select*  from city;");

        // Sorgu sonucunda data dışındakileri verir, kolon sayısı ve isimleri
        ResultSetMetaData rsmd = rs.getMetaData();

        int numberOfColumns = rsmd.getColumnCount();
        System.out.println("Number of rows: " + numberOfColumns);

        for (int i = 1; i <= numberOfColumns; i++) {
            System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));

        }
        rs.next();
        for (int i = 1; i <= numberOfColumns; i++) {
            System.out.println(i + "." + "row: " + rs.getString(i));

        }
        DBConnectionClose();
    }
}
