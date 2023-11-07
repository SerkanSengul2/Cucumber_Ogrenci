package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
        System.out.print("bir ifade giriniz= ");
        Scanner read = new Scanner(System.in);
        String word = read.nextLine();

        String readText = returningResult(word);
        System.out.println("readText = " + readText);
    }

    public static String returningResult(String word) throws IOException {
        StringBuilder output = new StringBuilder();

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().toLowerCase().contains(word.toLowerCase())) {

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {

                    output.append(sheet.getRow(i).getCell(j).toString());
                }
            }

        }
        return output.toString();
    }
}

