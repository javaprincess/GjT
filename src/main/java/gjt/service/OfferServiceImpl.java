package gjt.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Component;

import gjt.pojos.Offer;

@Component
public class OfferServiceImpl implements OfferService{

	private final Logger log = LogManager.getLogger(this.getClass().getName());
	
	//TODO: get this production ready.
	//private final String graphDBURL = "http://localhost:7474/db/data/transaction";
	
	public void submit(final Offer offer) {
		
	   String createString = "CREATE (:Offer {propertyId: " +  offer.getPropertyId()
                                  + ", amount: '" + offer.getAmount() + "'})";

           new NodeLoader().load(createString);

	}
	
}
