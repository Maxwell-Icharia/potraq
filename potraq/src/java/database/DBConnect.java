package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {
    
    public DBConnect(){
        
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch(SQLException e){
            System.out.println("SQL Exception Error" + "\n\n" + e);
        }catch(ClassNotFoundException e){
            System.out.println("Class Exception Error" + "\n\n" + e);
        }finally{
            if(this.conn != null){
                System.out.println("Connection Successful!");
            }else{
                System.out.println("Connection Failed!");
            }
        }
        
    }
    
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/potraq";

    //  Database credentials
    static final String USER = "test";
    static final String PASS = "test";
    
    // DB Connection Variable As null
    Connection conn = null;
    
}
