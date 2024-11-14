package JDBC;

import com.mongodb.DB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _07_Question extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // city tablosunda tüm satırlardaki şehir isimlerini relative yazdırınız

        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("Select city from city;");

        int a = 1;
        while (rs.next()) {
            rs.relative(0);
            System.out.println(a + "." + " Satır: " + rs.getNString("city"));
            a++;
        }

//        2.YOL
//        rs.last();
//        int sonSatirNo=rs.getRow(); // son satırı aldım
//
//        for (int i = 1; i < sonSatirNo; i++) {
//            rs.relative(0);
//            System.out.println(rs.getString("city"));  // 1 de verebilirdik
//        }


        DBConnectionClose();

    }
}
