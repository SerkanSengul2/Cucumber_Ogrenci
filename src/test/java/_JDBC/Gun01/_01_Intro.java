package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void Test1() throws SQLException {
        //         bir sorgunun çalışması için yapılanlar:
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

//    1- baglantı bilgilerini girdik, connection bilgilerini set ettik

        Connection baglanti = DriverManager.getConnection(hostUrl, username, password);

//    2- db seçtik : hostUrl ye bu bilgi eklendi, sakila eklentisi


//    3- sorgu ekranını açtık
        Statement sorguEkrani = baglanti.createStatement();

//    4- sorguyu yazdım, çalıştırdım
        ResultSet sonucTablosu = sorguEkrani.executeQuery("select * from customer");


//    5- altta sonuçlar göründü

        sonucTablosu.next(); // şuanda ilk satırı gelindi.
        String ad = sonucTablosu.getString("first_name");
        String soyad = sonucTablosu.getString("last_name");
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        sonucTablosu.next(); // şuanda ilk satırı gelindi.

        ad = sonucTablosu.getString("first_name");
        soyad = sonucTablosu.getString("last_name");
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        baglanti.close();


    }
}
