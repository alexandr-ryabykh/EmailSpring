package com.prodobro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sendEmail")
public class SendMailController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(method = RequestMethod.POST)
    public String doSendEmail(HttpServletRequest request) {

        String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message_body");

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipient);
        email.setSubject(subject);
        email.setText(message);

        mailSender.send(email);

        return "Result";
    }
}