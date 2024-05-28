/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icx.util;

import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author 94701
 */
public class Email {

    public static void send(String to, String subject, String message) {
        final String username = "yasithsandeshvithanage2002@gmail.com";
        final String password = "yasithsandeshvithanage20020729246810";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "false");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", 587);
//
//        Session session = Session.getInstance(props, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        }
//        );

        // Getting system properties 
        Properties properties = System.getProperties();

        // Setting up mail server 
        properties.put("mail.smtp.auth", false);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);

        // creating session object to get properties 
        Session session = Session.getDefaultInstance(properties);

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(username));
            mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            Transport.send(mimeMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
