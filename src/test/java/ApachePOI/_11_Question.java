package ApachePOI;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.

*/


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _11_Question {
    public static void main(String[] args) {

        String path="src/test/java/ApachePOI/resource/TestSonuclari.xlsx";

        String text="Test Passed";

        writeToExcel(path, text);
        writeToExcel(path, text);
        writeToExcel(path, text);
        writeToExcel(path, text);
        writeToExcel(path, text);
    }
    public static void writeToExcel(String path, String text){
        File file = new File(path);
        try {

            if (file.exists()) {
                FileInputStream inputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getPhysicalNumberOfRows();
                Row newRow = sheet.createRow(lastRow);
                Cell newCell = newRow.createCell(0);
                newCell.setCellValue(text);
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                System.out.println("Work Done.");
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Page1");
                Row newRow = sheet.createRow(0);
                Cell newCell = newRow.createCell(0);
                newCell.setCellValue(text);
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
