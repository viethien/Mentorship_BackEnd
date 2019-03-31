package com.khoa.mentorship.service.impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.khoa.mentorship.service.EmailService;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	public JavaMailSender emailSender;

	public void sendSimpleMessage(String to, String subject, String text) {
		try {
//			SimpleMailMessage message = new SimpleMailMessage();
//			message.setTo(to);
//			message.setSubject(subject);
//			message.setText(text);
			
			MimeMessage message = emailSender.createMimeMessage();

			try {
				MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");
				String htmlMsg = text;
				message.setContent(htmlMsg, "text/html");
				
				message.setSubject(subject);
				helper = new MimeMessageHelper(message, true);
				helper.setFrom("admin@mentorship.com");
				helper.setTo(to);
				helper.setText(text, true);
				emailSender.send(message);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MailException exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void sendSimpleMessageUsingTemplate(String to, String subject, SimpleMailMessage template,
			String... templateArgs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void sendSimpleMessageUsingTemplate(String to, String subject, SimpleMailMessage template, String... templateArgs) {
//		String text = String.format(template.getText(), templateArgs);
//		sendSimpleMessage(to, subject, text);
//	}
//
//	@Override
//	public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment) {
//		try {
//			MimeMessage message = emailSender.createMimeMessage();
//			// pass 'true' to the constructor to create a multipart message
//			MimeMessageHelper helper = new MimeMessageHelper(message, true);
//
//			helper.setTo(to);
//			helper.setSubject(subject);
//			helper.setText(text);
//
//			FileSystemResource file = new FileSystemResource(new File(pathToAttachment));
//			helper.addAttachment("Invoice", file);
//
//			emailSender.send(message);
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//	}

}
