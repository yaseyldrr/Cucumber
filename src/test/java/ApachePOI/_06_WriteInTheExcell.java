package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcell {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int lastRow = sheet.getPhysicalNumberOfRows(); // en son satır
        Row newRow = sheet.createRow(lastRow); // en son boş yer yeni satır
        Cell newCell = newRow.createCell(0); // yeni satırda hücre oluşturuldu
        newCell.setCellValue("Hello World!");
        inputStream.close();

        // dosyayı kaydet
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream); // workbook u yaz
        workbook.close(); // hafıza boşalt
        outputStream.close();


        System.out.println("Work Done.");

    }
}
