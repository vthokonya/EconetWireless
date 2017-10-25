/**
 * 
 */
package com.econetmedia.developer.interview.rest.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.econetmedia.developer.interview.rest.Address;
import com.econetmedia.developer.interview.rest.RestConsumer;
import com.econetmedia.developer.interview.rest.SampleRestObject;

/**
 * @author Victor Tichayana Hokonya
 * 
 * Rest service that receives a person's address
 * 
 * support json and xml
 *
 */
@Controller
@RequestMapping("/address")
public class AddressRestService {
	private static final Logger log = LoggerFactory.getLogger(AddressRestService.class);
	
	@RequestMapping(value="/getxmljson", method=RequestMethod.POST)
	@ResponseBody
	public String receiveAddress(@RequestParam(value="id", required=true) Integer id, @RequestParam(value="addressLine1", required=true) String addressLine1, @RequestParam(value="addressLine2", required=true) String addressLine2, @RequestParam(value="addressLine3", required=true) String addressLine3, @RequestParam(value="addressLine4", required=false) String... addressLine4){
		Address address = new Address(id, addressLine1, addressLine2, addressLine3, addressLine4);
		log.info(address.toString());
		
		RestConsumer consumer = new RestConsumerImpl();
		SampleRestObject obj = consumer.makeRestCall(id);
		log.info("called object : " + obj.toString());
		return "{\"response\":\"success\"}";
	}
}
