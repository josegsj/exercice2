package com.example.Exercice.Controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.joran.action.LoggerAction;

@RestController("AssemblageController")
public class AssemblageController {
	 private static final Logger logger = LogManager.getLogger("AssemblageController");
	
	 @RequestMapping(value = "/createRuling/{name}", method = RequestMethod.GET)
	    public ResponseEntity<String> createRuling(@PathVariable("name") String name){
		 try {
			 if(name!=null) {
				 
				 return new ResponseEntity<String>("OK", HttpStatus.OK); 
			 }
		} catch (Exception e) {
			logger.error(e);
		}
		
		return new ResponseEntity<String>("error", HttpStatus.EXPECTATION_FAILED); 
	       
	    }

}
