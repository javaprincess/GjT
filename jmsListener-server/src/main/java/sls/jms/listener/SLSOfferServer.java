package sls.jms.listener;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

@SpringBootApplication
@EnableJms
public class SLSOfferServer {

    @Autowired
    ConnectionFactory connectionFactory;

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
	DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
	factory.setConnectionFactory(connectionFactory);

	return factory;
    }

	public static void main(String[] args) {
	// Launch the application
	ConfigurableApplicationContext context = SpringApplication.run(SLSOfferServer.class, args);
			
    }
}
