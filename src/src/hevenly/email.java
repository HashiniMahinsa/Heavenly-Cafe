/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hevenly;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;

/**
 *
 * @author MSii
 */
public class email {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // email ID of Recipient.
      String recipient = "harshanimanishafernando@gmail.com";
 
      // email ID of  Sender.
      String sender = "hashini.mahinsa.fernando@gmail.com";
 
      // using host as localhost
      String host = "127.0.0.1";
 
      // Getting system properties
      Properties properties = System.getProperties();
 
      // Setting up mail server
      properties.setProperty("mail.smtp.host", host);
 
      // creating session object to get properties
      Session session = Session.getDefaultInstance(properties);
 
      try
      {
         // MimeMessage object.
         MimeMessage message = new MimeMessage(session);
 
         // Set From Field: adding senders email to from field.
         message.setFrom(new InternetAddress(sender));
 
         // Set To Field: adding recipient's email to from field.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
 
         // Set Subject: subject of the email
         message.setSubject("This is Subject");
 
         // set body of the email.
         message.setText("This is a test mail");
 
         // Send email.
         Transport.send(message);
         System.out.println("Mail successfully sent");
      }
      catch (MessagingException mex)
      {
         mex.printStackTrace();
      }
    }
}
