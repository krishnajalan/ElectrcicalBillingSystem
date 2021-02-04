/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author bansh
 */
public class StartScreen {
    public static void main(String[] args){
        fframe f1 = new fframe();
        f1.setVisible(true);
        int i;
        int j =1; //two varibales taken for maintaining size and location
        for(i=2; i<=640;i+=4,j+=1){ // increment of i and j determines speed of increment
            f1.setLocation(800 - ((i+j)/2),650 - (i/2)); // Passing variables for location
            f1.setSize(i+j,i); // controlling size
            try{
                Thread.sleep(10); // again controlling speed of opening and size increment
            } catch(Exception e){}
        }
    }
}

class fframe extends JFrame implements Runnable{
    Thread t1; //Thread for multi-threading
    fframe(){
        super("Electricity Billing System"); //Displayed on top
        setLayout(new FlowLayout()); // For setting the layout
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("images/startscreen.jpg")); //Adding a image for background
        Image i1 = c1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);  // Resizing the image
        ImageIcon i2 = new ImageIcon(i1); // passing it as an argument in image icon
        
        JLabel l1 = new JLabel(i2);
        add(l1); //adding the label in JFrame
        t1 = new Thread(this); //Creating an object for multithreading
        t1.start(); //initiating the thread
    }
    
    public void run(){ //method overriding 
        try{
            Thread.sleep(5000); // Setting done to switch off the frame is 7000 ms or 7 sec
        }
        catch(Exception e){}
    }
}
