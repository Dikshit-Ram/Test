package io.egen.training.notifications;

import io.egen.training.entity.Alerts;
import io.egen.training.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by Shiva Kumar on 6/29/2017.
 */
@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(Vehicle vehicle) throws MailException{


        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("sk-nadicherra@wiu.edu");
        mail.setFrom("shivak916@gmail.com");
        mail.setSubject("Over Speeding Vehicle");
        mail.setText(vehicle.toString());

        javaMailSender.send(mail);
    }
}
