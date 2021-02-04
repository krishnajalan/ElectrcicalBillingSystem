/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;
import java.sql.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author anshu sharma
 */


public class billing {
    
    static int currentUnit = 0;
    static FileWriter fw;
    static int unitConsumed;
    boolean check = true;
    float amt1 = 0, amt2 = 0, amt3 = 0, amt4 = 0;
    
    Calendar C=Calendar.getInstance();

    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date dat=C.getTime();
    String timestr="";
    String yearstr="";
    int uin=0;
    billing(){
       timestr=sdf.format(dat);
       yearstr=df.format(dat);
    }
    billing(String date, int u){
        check = false;
        uin = u;
        yearstr = date;
        timestr = "";
    }
    public float calculateBill(){
        if (unitConsumed>=150){
            amt1 = 150*6;
            if (unitConsumed >= 300){
                amt2 = 150*5.5f;
                if (unitConsumed >= 500){
                    amt3 = 200*6.5f;
                    amt4 = (unitConsumed-500)*7;
                }
                else{
                    amt3 = (unitConsumed-300)*6.6f;
                }
            }
            else{
                amt2 = (unitConsumed-150)*5.5f;
            }
        }
        else{
            amt1 = unitConsumed*6;
        }
        return amt1+amt2+amt3+amt4;
    }
    
    public float calculateBill(int unitConsumed){
        if (unitConsumed>=150){
            amt1 = 150*6;
            if (unitConsumed >= 300){
                amt2 = 150*5.5f;
                if (unitConsumed >= 500){
                    amt3 = 200*6.5f;
                    amt4 = (unitConsumed-500)*7;
                }
                else{
                    amt3 = (unitConsumed-300)*6.6f;
                }
            }
            else{
                amt2 = (unitConsumed-150)*5.5f;
            }
        }
        else{
            amt1 = unitConsumed*6;
        }
        return amt1+amt2+amt3+amt4;
    }
    
    
   int countrow(Connection con){
       int row = 0;
       try{
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from previous");
           while (rs.next()) row++;
       }
       catch(SQLException cerr){
           
       }
       return row;
   }
    public static void displaybill() throws IOException{
        String command = "Notepad 'bill.txt'";
        Runtime.getRuntime().exec(command);
    }
     String cmd;
           
    
    
    void updateunit(Connection obj, int unit, String user) throws SQLException{
        Statement st = obj.createStatement();
        st.executeUpdate("Update costumer_details set units_consumed ="+unit+" where username='"+user+"'");
    }
    
    
    void updateunit(Connection obj, int unit, int meter) throws SQLException{
        Statement st = obj.createStatement();
        st.executeUpdate("Update costumer_details set units_consumed ="+unit+" where username="+meter+"");
    }
    
    
    public String writeBill(ResultSet rs){
       
    
     
        try{
               
           rs.next();
           int unit = uin;
           if (check){
                unit = rs.getInt(13)-rs.getInt(11);
                
           }
            unitConsumed = (unit);
            if (unitConsumed < 0 ) 
                unitConsumed = 0;
                cmd =   "-------------------------------------------\n" +
                        "              ASAK_SOLUTIONS               \n" +
                        "-------------------------------------------\n" +
                        "\n" +
                        timestr + " " +
                        yearstr + "\n" +
                        "\n" +
                        "Meter No.: "+rs.getString(10) + "\n" +
                        "Name     : "+rs.getString(3) + "\n" +
                        "Address  : "+rs.getString(4) + "\n" +
                        "Phone no.: "+rs.getString(12) + "\n" +
                        "\n" +
                        "-------------------------------------------\n" +
                        "\n";
                        calculateBill();
                cmd += "First 150 units Costs @ Rs.6.0 : Rs." + amt1 + "\n" +
                        "Next 150 units Costs @ Rs.5.5 : Rs." + amt2 + "\n" +
                        "Next 200 units Costs @ Rs.6.5 : Rs." + amt3 + "\n" +
                        "Next 107 units Costs @ Rs.7.0 : Rs." + amt4 + "\n" +
                        "\n" +
                        "-------------------------------------------\n" +
                        "\n" +
                        "Unit Used: " + unitConsumed +
                        "\n" +
                        "Total Amount: Rs." + (amt1+amt2+amt3+amt4) +
                        "\n"+
                        "This is a system generated bill hence it does\n" +
                        "require any authoized signature.\n\n "+
                        "If the bill is not paid within 15 days of deadline\n"+
                        "it will result in disconnection as per 56(1) of EA,2003\n\n"+
                        "Thanks for choosing ASAK\n"+
                        "For more info reach us at: infoat.asak@gmail.com";
                   return cmd;
        }catch(SQLException cerr){
            System.out.println(cerr);
        }
        return "";
    }
    
    
    
   
    public static void main(String[] arg){
        
         System.out.print(new billing().calculateBill());
        
    }
}
 