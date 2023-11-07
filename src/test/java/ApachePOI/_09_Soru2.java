package ApachePOI;

import io.cucumber.java.sl.Ce;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru2 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa 1");

        for (int i = 1; i <= 10; i++) {
            Row row = sheet.createRow(i - 1);
            for (int j = 1; j <= 10; j++) {

                Cell cell1 = row.createCell(row.getPhysicalNumberOfCells());
                cell1.setCellValue(i);
                Cell cell2 = row.createCell(row.getPhysicalNumberOfCells());
                cell2.setCellValue("x");
                Cell cell3 = row.createCell(row.getPhysicalNumberOfCells());
                cell3.setCellValue(j);
                Cell cell4 = row.createCell(row.getPhysicalNumberOfCells());
                cell4.setCellValue("=");
                Cell cell5 = row.createCell(row.getPhysicalNumberOfCells());
                cell5.setCellValue(i * j);
                Cell cell6 = row.createCell(row.getPhysicalNumberOfCells());
                cell6.setCellValue("");

            }
        }

        String path = "src/test/java/ApachePOI/resource/TODO.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
