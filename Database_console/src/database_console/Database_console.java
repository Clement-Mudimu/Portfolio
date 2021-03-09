/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kuda
 */
public class Database_console {
    public static void main(String[] args){
    try{
    String host = "jdbc:derby://localhost:1527/Employees";
    String uName = "root";
    String uPass= "1234";
     
    
      Connection con = DriverManager.getConnection(host,uName,uPass);
}
      catch ( SQLException err ) {
      System.out.println( err.getMessage( ) );
}
    
}
}
