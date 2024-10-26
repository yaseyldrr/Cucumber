package ApachePOI;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 *  
 */
public class _05_GetASpecificData {

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data you want to find: ");
        String word = input.nextLine();
        System.out.println(getData(word, path));

    }

    public static String getData(String word, String path) throws IOException {
        String data = "";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().equals(word)) {
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    data = sheet.getRow(i).getCell(j).getStringCellValue();
                }
            }

        }
        return data;
    }
}
