package server.integration.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BindingsConfiguration {

//    @Value("${binding.simple.email}")
////    private String emailDirectBindingKey;
////
////    @Bean
////    public Binding bindDirectExchangeToEmailQueue(@Qualifier("emailQueue") Queue emailQueue, DirectExchange directExchange) {
////        return BindingBuilder.bind(emailQueue).to(directExchange).with(emailDirectBindingKey);
////    }

}
