package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_AbsRel extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();
        ResultSet rs = statement.executeQuery("select * from film;");

        rs.absolute(10); // direkt 10. satıra gider
        System.out.println("10. Satır: " + rs.getNString("title"));


        rs.absolute(5);
        System.out.println("5. Satır: " + rs.getNString("title"));


        rs.relative(5); // bulunduğun yerden 5. satıra gider : 10. satır
        System.out.println("10. Satır: " + rs.getNString("title"));


        DBConnectionClose();
    }
}
