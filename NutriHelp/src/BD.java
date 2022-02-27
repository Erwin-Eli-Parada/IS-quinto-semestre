
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class BD {
    public static final String URL = "jdbc:mysql://localhost:3306/nutrihelp";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    
    public static Connection getConection(){
        Connection con =null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
