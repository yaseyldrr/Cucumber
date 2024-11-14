package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrev extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();
        System.out.println("1.Row: " + rs.getNString(2)); // 2 index değil kolon sırası (English)

        rs.next();
        System.out.println("1.Row: " + rs.getNString(2)); // (Italian)

        rs.previous(); // 2 adım geri git
        System.out.println("1.Row: " + rs.getNString(2)); // (English)



        DBConnectionClose();

    }
}
