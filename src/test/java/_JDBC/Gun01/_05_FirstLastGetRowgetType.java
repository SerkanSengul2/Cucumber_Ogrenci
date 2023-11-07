package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        ResultSet rs=queryScreen.executeQuery("select city from city");
        
        rs.last();// son satıra gider
        System.out.println("rs.getString(1) = " + rs.getString(1));
        
        rs.first();// ilk satıra gider
        System.out.println("rs.getString(1) = " + rs.getString(1));

        rs.last();
        int kacinciSatirdayim=rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

    }
}
