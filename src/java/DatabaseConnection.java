/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uspan
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    static Connection conn = null;
   public static Connection getConnection() {
      if (conn != null) return conn;
      String database = "mysql1";
      String Username = "root";
      String password = "root";
      return getConnection(database, Username, password);
   }
    private static Connection getConnection(String databaseName, String UserName, String password) {
      try {
         Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }
}
