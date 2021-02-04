/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException; 
import javax.mail.Session;
import javax.mail.Transport; 
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author krish
 */
public class EmailSender {
       public static void sendMail(String to, String subject, String mail){
           Properties pro = new Properties();
           pro.put("mail.smtp.auth", "true");
           pro.put("mail.smtp.starttls.enable", "true");
           pro.put("mail.smtp.port", "587");
           pro.put("mail.smtp.host", "smtp.gmail.com");
           
           String password = "AsakAdmiNaccount";
           String fromEmail = "infoat.asak@gmail.com";
           String toEmail = to;
           Session session = Session.getInstance(pro, new javax.mail.Authenticator() {
                        @Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(fromEmail ,password);
			}
		});
           
           MimeMessage msg = new MimeMessage(session);
           try{
                msg.setFrom(new InternetAddress(fromEmail));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                msg.setSubject(subject);
                msg.setText(mail);
                Transport.send(msg);
           }catch(MessagingException cerr){
               
           }
       }
       
       public static void main(String arg[]){
           sendMail("krihnajalan2001@gmail.com","registration successfull","you have been registered to asak!");
       }
}
