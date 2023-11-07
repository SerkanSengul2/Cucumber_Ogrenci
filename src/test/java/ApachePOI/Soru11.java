package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Soru11 {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";
        String sheetName = "testCitizen";
        int sutunsayisi = 1;

        ArrayList<ArrayList<String>> data = getData(path, sheetName, sutunsayisi);
        for (List Satir : data) {
            System.out.println("a = " + Satir);
        }

    }

    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int sutunsayisi) {
        ArrayList<ArrayList<String>> Tablo = new ArrayList<>();

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> satir = new ArrayList<>();

            for (int j = 0; j < sutunsayisi; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());


            }
            Tablo.add(satir);
        }

        return Tablo;
    }
}
