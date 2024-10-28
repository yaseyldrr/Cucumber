package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int columnNumber) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);

        } catch (Exception e) {
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

    public static void writeToExcel(String path, String testName, String testResult) {
        File dosya = new File(path);
        try {
            if (!dosya.exists()) { // dosya yok ise
                XSSFWorkbook workbook = new XSSFWorkbook(); // yeni oluştur
                XSSFSheet sheet = workbook.createSheet("Page1");
                Row yeniSatir = sheet.createRow(0);

                Cell yeniHucre = yeniSatir.createCell(0);
                yeniHucre.setCellValue(testName);  // değeri ver

                yeniHucre = yeniSatir.createCell(1);
                yeniHucre.setCellValue(testResult);  // değeri ver

                FileOutputStream outputStream = new FileOutputStream(path);  //kaydet
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } else {  // dosya var ise
                FileInputStream inputStream = new FileInputStream(path);  //var olanı oku
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);
                int enSonSatir = sheet.getPhysicalNumberOfRows();

                Row newRow = sheet.createRow(enSonSatir);
                Cell yeniHucre = newRow.createCell(0);
                yeniHucre.setCellValue(testName);  // değeri ver

                yeniHucre = newRow.createCell(1);
                yeniHucre.setCellValue(testResult);  // değeri ver

                FileOutputStream outputStream = new FileOutputStream(path);  //kaydet
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
