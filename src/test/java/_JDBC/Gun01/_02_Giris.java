package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Giris extends JDBCParent {
    @Test
    public void Test1() throws SQLException {
        ResultSet sonuc = queryScreen.executeQuery("select * from customer");

        sonuc.next();
        System.out.println("Ad= " + sonuc.getString("first_name"));
        System.out.println("SoyAd= " + sonuc.getString("last_name"));


        sonuc.next();
        System.out.println("Ad= " + sonuc.getString("first_name"));
        System.out.println("SoyAd= " + sonuc.getString("last_name"));


        sonuc.previous();
        System.out.println("Ad= " + sonuc.getString("first_name"));
        System.out.println("SoyAd= " + sonuc.getString("last_name"));
    }
}
