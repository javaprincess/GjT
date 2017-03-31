package gjt.service;

import org.springframework.stereotype.Service;

import gjt.pojos.Offer;

@Service
public interface OfferService {

	public void submit(Offer offer);
		
}
