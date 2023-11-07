package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream FileReadingConnection=new FileInputStream(path);
        Workbook workbook=WorkbookFactory.create(FileReadingConnection);
        Sheet WorkPage=workbook.getSheet("Sheet1");
        Row row=WorkPage.getRow(0);
        Cell cell=row.getCell(0);

        System.out.println("cell = " + cell);

        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));

    }
}
