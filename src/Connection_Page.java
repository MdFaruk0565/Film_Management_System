
package RifatFilm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Connection_Page {
    Connection con;
    Statement stm;
    PreparedStatement psmt;
    public Connection_Page(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aponfilmindustry","root","");
            stm = con.createStatement();
            //psmt=con.prepareStatement("");
            
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
