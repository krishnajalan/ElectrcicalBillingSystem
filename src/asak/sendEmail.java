/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author Truth
 */
public class sendEmail {
    public sendEmail(){
        
    }
    public static void send(String to, String s, String m){
        Properties props=new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session=Session.getDefaultInstance(props,
                new javax.mail.Authenticator(){
                    protected PasswordAuthentication getPasswordAuthentication(){
                      return new PasswordAuthentication("singhvisahil1973@gmail.com","#Truth1612");
                
                }
                });
        try{
        
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress("singhvisahil1973@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(s);
            message.setText(m);
            
            Transport.send(message);
        }
       catch(MessagingException e){
           throw new RuntimeException(e);
       }
        
    }
           
}


