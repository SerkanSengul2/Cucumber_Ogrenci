package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru1 {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile .xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = 0;

         for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                Row row = sheet.createRow(rowCount++);

                Cell cell1 = row.createCell(0);
                cell1.setCellValue(i);

                Cell cell2 = row.createCell(1);
                cell2.setCellValue("x");

                Cell cell3 = row.createCell(2);
                cell3.setCellValue(j);

                Cell cell4 = row.createCell(3);
                cell4.setCellValue("=");

                Cell cell5 = row.createCell(4);
                cell5.setCellValue(i * j);
            }
             Row Blank = sheet.createRow(rowCount++);
         }
         inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}