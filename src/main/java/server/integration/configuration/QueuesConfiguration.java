package server.integration.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueuesConfiguration {

    @Value("${queue.email}")
    private String emailQueueName;

    @Bean(name = "emailQueue")
    public Queue emailQueue() {
        return new Queue(emailQueueName);
    }

}
