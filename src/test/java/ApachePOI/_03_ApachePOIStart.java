package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // Java dosya okum anesnesine bağlantıyı vererek bağlantı kuruyorum
        FileInputStream fileInputStreamConnect = new FileInputStream(path);

        // Dosya okuma işlemcisi üzeirnden workbook u alıyorum
        // hafızada (RAM de) workbook u alıp oluştrdu
        Workbook workbook = WorkbookFactory.create(fileInputStreamConnect);

        // İstediğim isimdeki çalışma sayfasını alıyorum
        Sheet worksheet = workbook.getSheet("Sheet1");


        // İstenen satırı alıyorum
        Row row = worksheet.getRow(0);

        // İstenen sütundaki hücreyi al
        Cell cell = row.getCell(0); // 0. hücre
        System.out.println(cell.getStringCellValue());



    }
}
