package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class _01_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = queryScreen.executeQuery("select city_id,city,country_id from city");
        rs.last();

        String id = rs.getString(1);// 1. kolon city_id;
        System.out.println("id = " + id);

        int intId = rs.getInt(1);
        System.out.println("intId = " + intId);// eğer tipi int ise rs.getint ile de alabilirsin
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = queryScreen.executeQuery("select * from city");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();

        rs.next();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getString(i) + " ");
        }

        System.out.println();

        for (int i = 1; i < columnCount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t" + rsmd.getColumnType(i));
        }
    }

    @Test
    public void test3() throws SQLException {
        ResultSet rs = queryScreen.executeQuery("SELECT * FROM language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i) + "\t");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-20s", rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test4() {
        String sorgu = "select * from language";
        List<List<String>> donenList = getListData(sorgu);
        for (List<String> row : donenList) {
            System.out.println(row + "\t");
        }
    }

    public List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = queryScreen.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                List<String> satir = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }


        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        return tablo;
    }

}


