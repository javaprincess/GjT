package sls.service;

import sls.graph.nodes.Offer;
import org.springframework.stereotype.Service;

@Service("offerSubmissionService")
public interface OfferSubmissionService {

	public void submit(Offer offer);
}
