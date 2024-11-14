package JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _10_Question extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // language tablosundaki tüm satırları ve sütunları yazdırnız
        // aynı mysql sonuçlarında olduğu gibi

        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("Select * from language;");
        ResultSetMetaData rsmd = rs.getMetaData();

        int numberOfColumns = rsmd.getColumnCount();

        for (int i = 1; i <= numberOfColumns; i++) { // başlıkları yaz
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println(); // başlıktan sonra 1 satır atla

        while (rs.next()) {

            for (int j = 1; j <= numberOfColumns; j++) {
                System.out.print(rs.getString(j) + "\t"); // bu bölüm satırdaki kolonları yazdırır
            }
            System.out.println();
        }


        DBConnectionClose();
    }
}
