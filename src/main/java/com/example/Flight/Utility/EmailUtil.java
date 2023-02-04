package com.example.Flight.Utility;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.example.Flight.Entity.Reservation;

@Component
public class EmailUtil {
	
	/*
	 * @Autowired private JavaMailSender sender;
	 * 
	 * public void emailItinerary(String toAddress,String filePath) { MimeMessage
	 * message = sender.createMimeMessage(); try { MimeMessageHelper messageHelper =
	 * new MimeMessageHelper(message,true); messageHelper.setTo(toAddress);
	 * messageHelper.setSubject("Itinerary of flights");
	 * messageHelper.setText("Please find the attched");
	 * messageHelper.addAttachment("nerary", new File(filePath));
	 * sender.send(message);
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); } }
	 */
}
