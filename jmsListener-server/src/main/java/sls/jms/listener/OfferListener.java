package sls.jms.listener;
 
import javax.jms.JMSException;
 
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
 
import sls.graph.nodes.Offer;
import sls.service.OfferSubmissionService;
 
@Component
public class OfferListener {
    private final Logger log = LogManager.getLogger(OfferListener.class);
 
    //private static final String SLS_OFFER_QUEUE = "SLS_OFFER_QUEUE";
     
    //@Autowired
    //OfferSubmissionService offerSubmissionService;
     
     
    @JmsListener(destination = "SLS_OFFER_QUEUE")
    public void receiveMessage(final Message<Offer> message) throws JMSException {
        log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        MessageHeaders headers =  message.getHeaders();
        log.info("Application : headers received : {}", headers);
         
        Offer offer = message.getPayload();
        log.info("Application : response received : {}", offer);
         
        log.info("now we need to call the OfferSubmissionService");
	//offerSubmissionService.submit(offer);

        log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
