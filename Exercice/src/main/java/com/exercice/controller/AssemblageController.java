package com.exercice.controller;


import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.exercice.Dao.RulingDaoRepository;
import br.exercice.bean.Ruling;
import br.exercice.bo.SessionBo;
import br.exercice.bo.VoteBo;

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
	 
	 
	 @GetMapping("/createSession/{name,time}")
	    public ResponseEntity<String> createSession(@PathVariable("name") String name,@PathVariable("time")Date time){
		 try {
			 if(name!=null) {
				 SessionBo sessionBo= new SessionBo(name, time);
				 if(sessionBo.createSession())
					 return new ResponseEntity<String>("OK", HttpStatus.OK); 
			 }
		} catch (Exception e) {
			logger.error(e);
		}
		
		return new ResponseEntity<String>("error", HttpStatus.EXPECTATION_FAILED); 
	       
	    }
	 
	 
	 @GetMapping("/voteSession/{name,cpf,vote}")
	    public ResponseEntity<String> voteSession(@PathVariable("name") String name,@PathVariable("cpf")String cpf,@PathVariable("vote")boolean vote){
		 try {
			 if(name!=null) {
				 VoteBo voteBo= new VoteBo(vote,cpf,name);
				 if(voteBo.insertVote())
					 return new ResponseEntity<String>("OK", HttpStatus.OK); 
			 }
		} catch (Exception e) {
			logger.error(e);
		}
		
		return new ResponseEntity<String>("error", HttpStatus.EXPECTATION_FAILED); 
	       
	    }
	 
	 @GetMapping("/result/{name}")
	    public ResponseEntity<String> result(@PathVariable("name")String name){
		 try {
			 if(name!=null) {
				 VoteBo voteBo= new VoteBo(name);
				 long result=voteBo.result();
				 if(result>0)
					 return new ResponseEntity<String>(result+ "-" +name, HttpStatus.OK); 
			 }
		} catch (Exception e) {
			logger.error(e);
		}
		
		return new ResponseEntity<String>("error", HttpStatus.EXPECTATION_FAILED); 
	       
	    }
	 
	 

}
