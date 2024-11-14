package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Question extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // city tablosunda tüm satırlardaki şehir isimlerini absolute yazdırınız.
        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("select city from city;");
        rs.next();
        int a = 1;
        while (rs.next()) {
            rs.absolute(a);
            System.out.println(a + "." + " Satır: " + rs.getNString("city"));
            a++;
        }

        DBConnectionClose();

        /*
        // 2.YOL
        rs.last();
        int sonSatirNo=rs.getRow(); // son satırı aldım

        for (int i = 1; i < sonSatirNo; i++) {
            rs.absolute(i);
            System.out.println(rs.getString("city"));  // 1 de verebilirdik
        }
         */

        // rs.next() : sonraki satır
        // rs.previous : önceki satır
        // rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
        // rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
        // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
        // rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
        // ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir
    }
}
