/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author bansh
 */
public class conn {
    public static void main(String[] args){
        try {
            String host = "jdbc:derby://localhost:1527/ASAKDatabase";
            String uName = "asakadmin";
            String uPass = "asakadmin";
        
            Connection con = DriverManager.getConnection(host, uName, uPass);
        
            Statement stat = con.createStatement();
            String sql = "SELECT * FROM ASAKADMIN.LOGINDATA";
            ResultSet rs = stat.executeQuery(sql);
            
            
            while(rs.next()){
                String USERNAME = rs.getString("USERNAME");
                String PASSWORD = rs.getString("PASSWORD");
                
                String p = USERNAME + " " + PASSWORD ; 
                //String p = NAME + " " + METER_NUMBER + " " + ADDRESS + " " + CITY + " " + STATE + " " + PINCODE + " " + EMAIL + " " + PHONE;
            }
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
