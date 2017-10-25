/**
 * 
 */
package com.econetmedia.developer.interview.rest.impl;

import org.springframework.web.client.RestTemplate;

import com.econetmedia.developer.interview.rest.RestConsumer;
import com.econetmedia.developer.interview.rest.SampleRestObject;

/**
 * @author Victor Tichayana Hokonya
 * 
 */
public class RestConsumerImpl implements RestConsumer{

	@Override
	public SampleRestObject makeRestCall(int postId) {
		RestTemplate template = new RestTemplate();
		
		return template.getForObject("https://jsonplaceholder.typicode.com/posts/"+postId, SampleRestObject.class);
	}

}
