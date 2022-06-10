/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection con;
    public static Statement stm;
    public static Connection config() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/dbperkuliahan"; //url database
            String user="root"; //user database
            String pass=""; //password database
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbperkuliahan", "root", "");
            stm = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }

}
/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class config {
    //private static Connection mysqlconfig;
    public static Connection con;
    public static Statement stm;
    public static Connection configDB()throws SQLException{
        try {
           // String url="jdbc:mysql://localhost:3306/dbperkuliahan"; //url database
           /* String user="root"; //user database
            String pass=""; //password database
           */
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // mysqlconfig=DriverManager.getConnection(url, user, pass);
          //  Class.forName("com.mysql.jdbc.Driver");
          //  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbperkuliahan", "root", "");
         //   Statement stm = con.createStatement();            
      //  } catch (ClassNotFoundException | SQLException e) {
      //      System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
      //  }
       // return mysqlconfig;
      //  return null;
  //  }    
 
//}
