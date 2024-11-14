package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Question_2 extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();

        ResultSet resultSet = statement.executeQuery("select * from city");

        while (resultSet.next())
            System.out.println(resultSet.getNString("city"));

        DBConnectionClose();


    }
}
