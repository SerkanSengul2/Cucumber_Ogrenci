package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/Sayfa1.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int LastLineIndex = sheet.getPhysicalNumberOfRows();
        Row NewLine = sheet.createRow(LastLineIndex);
        Cell Newcell = NewLine.createCell(0);
        Newcell.setCellValue("Merhaba    Dünya");
        inputStream.close();

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem bitti");

    }
}
