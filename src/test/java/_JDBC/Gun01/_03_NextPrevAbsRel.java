package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = queryScreen.executeQuery("select * from language");


        rs.next();
        System.out.println("1.Satır = " + rs.getString(2));

        rs.next();
        System.out.println("2.Satır = " + rs.getString(2));

        rs.previous();
        System.out.println("1.Satır = " + rs.getString(2));

    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = queryScreen.executeQuery("select * from film");


        rs.absolute(10); // 10 satıra direkt git
        System.out.println("10.Satır'ın title = " + rs.getString("title"));

        rs.relative(5); // en son nerdeysen,oradan itibaren 5 satır git.
        System.out.println("5.Satır title = " + rs.getString("title"));

        rs.relative(5); // en son nerdeysen,oradan itibaren 5 satır git.
        System.out.println("10.Satır'ın title = " + rs.getString("title"));

    }
}
