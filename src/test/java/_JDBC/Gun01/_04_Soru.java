package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

// rs.absolute(10) : baştan itibaren 10.satıra gider.
// rs.relative(10) : bulunduğu yerden 10.satıra gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri
// city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız
public class _04_Soru extends JDBCParent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = queryScreen.executeQuery("select * from city ");

        while (rs.next())
            System.out.println(rs.getString("city"));


    }


    @Test
    public void Test2() throws SQLException {
        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
        ResultSet rs = queryScreen.executeQuery("select * from city");

        int rowcount = 0;
        while (rs.absolute(++rowcount))
            System.out.println("cityName= " + rs.getString("city"));

    }


    @Test
    public void Test3() throws SQLException {
        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
        ResultSet rs = queryScreen.executeQuery("select * from city ");
        rs.last();
        while (rs.relative(-1))
            System.out.println(rs.getString("city"));


    }

}






