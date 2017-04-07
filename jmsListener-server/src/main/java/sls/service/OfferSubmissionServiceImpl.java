package sls.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Service;

import sls.graph.nodes.Offer;
import sls.graph.NodeLoader;

@Service("offerSubmissionService")
public class OfferSubmissionServiceImpl implements OfferSubmissionService {
	private final Logger log = LogManager.getLogger(this.getClass().getName());

	public void submit(final Offer offer) {
		log.info("creating the Node query string");
		String createNodeString = "CREATE (:Offer {propertyId: " +  offer.getPropertyId()
                	+ ", amount: '" + offer.getAmount() + "'})";
		
		log.info("loading offer into the graph db");
		new NodeLoader().load(createNodeString);
	}
}
