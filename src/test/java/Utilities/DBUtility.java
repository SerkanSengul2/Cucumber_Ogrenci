package Utilities;

import _JDBC.JDBCParent;
import com.mongodb.DBCollection;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    public static Connection connection;
    public static Statement statement;


    public static List<List<String>> getListData(String sql) {
        DBConnectionOpen();

        List<List<String>> dataList = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                List<String> satir = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
                dataList.add(satir);
            }


        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        DBConnectionClose();
        return dataList;
    }

    @BeforeClass
    public static void  DBConnectionOpen() {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(hostUrl, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

    }
    @AfterClass
    public static void  DBConnectionClose() {

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
