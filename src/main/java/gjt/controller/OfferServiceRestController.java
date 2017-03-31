package gjt.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import gjt.service.OfferService;
import gjt.pojos.Offer;



@RestController
@RequestMapping(value="/offer")
public class OfferServiceRestController {
	private final Logger log = LogManager.getLogger(this.getClass().getName());

	@Autowired
	OfferService offerService;

	//when the client sends in a request, they send it a map that contains duplicate keys
	//this map needs to be transformed into a List<DictionaryEntry>
	//so we can populate the graphDB
	//the client shouldn't know about the internals of how we populate things...hence the
	//map w/dup keys
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public @ResponseBody void create(@RequestBody Offer offer) {
		log.info("submitting the offer...there is currently no error handling. This is a HUGE TODO!!!!");
	    offerService.submit(offer);
	  
	}

}
