/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvkabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author balinux
 */
public class Database {
    public static Connection connection;
    
    public static Connection getConnection(){
        if(connection==null){
            try{
             String url = "jdbc:mysql://localhost:3306/tvkabel";
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,"root","ninja");
             System.out.println("berhasil konek ke database");
            }
            catch(SQLException e){
            System.out.println("koneksi gagal ke database");
            }
        }
        return connection;
    }
    
    public static void main( String[] args){
    getConnection();
    }
}
