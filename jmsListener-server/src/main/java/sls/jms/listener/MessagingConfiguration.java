package sls.jms.listener;

import java.util.Arrays;
import java.util.ArrayList;
 
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
 
@Configuration
public class MessagingConfiguration {
 
    //use this if you start the JMS broker programmatically
    //private static final String DEFAULT_BROKER_URL = "tcp://localhost:51610"; 

    //use this if you start the JMS broker through the activemq.bat start command
    private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616"; 
     
    private static final String SLS_OFFER_QUEUE= "SLS_OFFER_QUEUE";
 
    @Bean
    public ActiveMQConnectionFactory connectionFactory(){
	System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES","java.util");
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setTrustedPackages(new ArrayList(Arrays.asList("sls.graph.nodes, java.util".split(","))));
        connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
        return connectionFactory;
    }
     
    @Bean
    public JmsTemplate jmsTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestinationName(SLS_OFFER_QUEUE);
        return template;
    }
     
}
