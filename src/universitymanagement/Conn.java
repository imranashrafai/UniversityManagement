package universitymanagement;

import java.sql.*;
public class Conn {
    Connection conn;
    Statement sta;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums_uol","root","");
            sta=conn.createStatement();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
