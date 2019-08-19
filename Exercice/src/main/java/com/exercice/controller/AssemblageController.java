package com.exercice.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.exercice.Dao.RulingDaoRepository;
import br.exercice.bean.Ruling;

@RestController("AssemblageController")
public class AssemblageController {
	 private static final Logger logger = LogManager.getLogger("AssemblageController");
	
	 private  RulingDaoRepository rulingDao;
	 @GetMapping("/createRuling/{name}")
	    public ResponseEntity<String> createRuling(@PathVariable("name") String name){
		 try {
			 if(name!=null) {
				 Ruling ruling = new Ruling();
				 ruling.setName(name);
				 rulingDao.save(ruling);
				 return new ResponseEntity<String>("OK", HttpStatus.OK); 
			 }
		} catch (Exception e) {
			logger.error(e);
		}
		
		return new ResponseEntity<String>("error", HttpStatus.EXPECTATION_FAILED); 
	       
	    }
	 
	 

}
