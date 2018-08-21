package com.shared;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {

	//TODO Please enter the valid email id here
		private static String emailAddress = "yashshah5325@gmail.com";
		//TODO Please enter the valid email id - Password here
		private static String emailPassword = "yash@321";

		public static void main(String args[]) {
			send("yashshah5325@gmail.com", "shahyash5100@gmail.com","Please find your Password",
					"Your password College Alumni Portal is::");
		}
		
		public static void send(String from, String to, String sub, String msg) {
			// Get properties object
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");
			// get Session
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(emailAddress, emailPassword);
				}
			});
			// compose message
			try {
				MimeMessage message = new MimeMessage(session);
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				message.setSubject(sub);
				message.setText(msg);
				// send message
				Transport.send(message);
				System.out.println("message sent successfully");
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}

		}
}
