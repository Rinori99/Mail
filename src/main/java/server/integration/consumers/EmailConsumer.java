package server.integration.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import server.integration.models.SerializableEmail;
import server.services.EmailService;

@Service
public class EmailConsumer {

    private EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${queue.email}")
    public void handleSimpleEmailQueueReception(SerializableEmail serializableEmail) {
        emailService.sendSimpleMessage(serializableEmail.getTo(), serializableEmail.getSubject(), serializableEmail.getText());
    }

}
