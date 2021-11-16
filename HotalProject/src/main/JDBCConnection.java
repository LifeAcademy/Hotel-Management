
package main;

import java.sql.*;

public class JDBCConnection {

   
    final static String driverclass="com.mysql.cj.jdbc.Driver";
    final static String connectionURL="jdbc:mysql://localhost:3306/HotelGroup";
    final static String username="root";
    final static String password="anil9879";
           
    static Connection con=null;

    public static Connection getConnection(){
        try{
        	Class.forName(driverclass);
            con=DriverManager.getConnection(connectionURL, username, password);
            }catch(Exception e){
             
        }
        return con;
    }
}
