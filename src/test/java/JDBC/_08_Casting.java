package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _08_Casting extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBCoonectionOpen();

        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city;");
        rs.next();
        System.out.println("id=" + rs.getString(1)); // getString() ile bütün tipleri alabilirim
        System.out.println("id=" + rs.getString("city_id"));

        int cityId = rs.getInt("city_id"); // Kolonun titpine uygun get ile alabilirsin
        System.out.println("city_id= " + cityId);





        DBConnectionClose();
    }
}
