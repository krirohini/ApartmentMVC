package com.apartment.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sendEmail")
public class SendEmailController {

	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping(value="/sendEmail", method = RequestMethod.GET)
	public String sendEmail() {
		System.out.println("============ Controller ======= sendEmail =======GET=====");			
		return "sendEmail";
	}
	
	@RequestMapping(value="/sendEmail", method = RequestMethod.POST)
	public String doSendEmail(HttpServletRequest request) {
		System.out.println("============ Controller ======= sendEmail =======GET=====");
		// takes input from e-mail form
//		String recipientAddress = request.getParameter("recipient");
		String recipientAddress = request.getParameter("recipient");
		String senderAddress = request.getParameter("sender");

		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("From: " + senderAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		
		// creates a simple e-mail object
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(recipientAddress);
		email.setFrom(senderAddress);
		email.setSubject(subject);
		email.setText(message);
		
		// sends the e-mail
		mailSender.send(email);
		
		// forwards to the view named "Result"
		return "Result";
	}
}