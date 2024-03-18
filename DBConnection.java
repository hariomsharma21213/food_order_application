
package org.xemacscode.demo;
import java.sql.*;

public class DBConnection {
    
    
    
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";
    
    
    public static Connection connectDB(){
        
        Connection conn = null;
        
        try{
            
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
            
        }catch(Exception ex){
            
            System.out.println("There were errors while connecting to Database.");
            
            return null;
        }
    }
}
