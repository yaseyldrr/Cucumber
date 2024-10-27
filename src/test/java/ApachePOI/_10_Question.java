package ApachePOI;


/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız. Mainde Listi yazdırınız.
   Bu soruda kaynak Excel için : ApacheExcel2.xlsx  in 2.sheet ini kullanabilirsiniz.
 */

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _10_Question {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName = "testCitizen";
        int columnNumber = 1;
        ArrayList<ArrayList<String>> data = getData(path, sheetName, columnNumber);
        for (ArrayList<String> row : data){
            for (String cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int columnNumber) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < columnNumber; j++) {
                row.add(sheet.getRow(i).getCell(j).toString());
            }
            data.add(row);
        }
        return data;

    }
}
