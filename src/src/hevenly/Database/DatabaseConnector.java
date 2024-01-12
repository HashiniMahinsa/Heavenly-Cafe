/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hevenly.Database;

import java.sql.*;

/**
 *
 * @author MSii
 */
public class DatabaseConnector {

public static Connection connect(){
Connection conn = null;
try{
Class.forName("com.mysql.jdbc.Driver");
conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/heavenlycafedatabase","root","");  

}

catch(Exception e){
System.out.println(e);
}

return conn;

}   
}
