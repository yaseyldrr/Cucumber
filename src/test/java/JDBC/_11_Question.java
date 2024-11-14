package JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _11_Question extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // Kendisine gönderilen bir select sorgusunun sonucunu bir ArrayList olarak döndüren
        // metodu yazınız. Main de Listi yazdırarak sonucu kontrol ediniz.

        String query = "Select * from language;";
        ArrayList<ArrayList<String>> wantedData = getData(query);

        for (List<String> rows : wantedData) {
            for (String cell : rows)
                System.out.print(cell + "\t");
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<String>> getData(String query) throws SQLException {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        DBCoonectionOpen();
        ResultSet rs = statement.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();

        int numberOfColumns = rsmd.getColumnCount();

        while (rs.next()) {
            ArrayList<String> rows = new ArrayList<>();
            for (int j = 1; j <= numberOfColumns; j++) {
                rows.add(rs.getString(j));
            }
            data.add(rows);
        }

        DBConnectionClose();
        return data;
    }

}
