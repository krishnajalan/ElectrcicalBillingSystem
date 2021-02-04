/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;

/**
 *
 * @author bansh
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBconnect {
    public static void main(String[] args){
        
        try {
            String host = "jdbc:derby://localhost:1527/ASAKDatabase";
            String uName = "asakadmin";
            String uPass = "asakadmin";
        
            Connection con = DriverManager.getConnection(host, uName, uPass);
        
            Statement stat = con.createStatement();
            String sql = "SELECT * FROM ASAKADMIN.NEWCOSTUMER";
            ResultSet rs = stat.executeQuery(sql);
            
            
            while(rs.next()){
                String NAME = rs.getString("NAME");
                int METER_NUMBER = rs.getInt("METER_NUMBER");
                String ADDRESS = rs.getString("ADDRESS");
                String CITY = rs.getString("CITY");
                String STATE = rs.getString("STATE");
                int PINCODE = rs.getInt("PINCODE");
                String EMAIL = rs.getString("EMAIL");
                int PHONE = rs.getInt("PHONE");
                
                String p = NAME + " " + METER_NUMBER + " " + ADDRESS + " " + CITY + " " + STATE + " " + PINCODE + " " + EMAIL + " " + PHONE;
            }
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        
    }
}
