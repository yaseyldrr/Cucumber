package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcellWrite {
    public static void main(String[] args) throws IOException {
        // ortada bir excel dosyası yok
        // workbook ve sheet i hafızada oluşturmak lazım

        XSSFWorkbook workbook = new XSSFWorkbook(); // hafizadaki workbook
        XSSFSheet sheet = workbook.createSheet("Page1");

        Row newRow = sheet.createRow(0);
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("Hello World!");

        String path = "src/test/java/ApachePOI/resource/NewExcelFile2.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem tamam");




    }
}
