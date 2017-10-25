package com.econetmedia.developer.interview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by bmukorera on 9/10/2017.
 */
@SpringBootApplication
public class ApplicationInitializer {
	private static final Logger log = LoggerFactory.getLogger(ApplicationInitializer.class);
	
    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }

}
