package com.cg.hims.controller;



	import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
	//import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

	import com.cg.hims.entities.Policy;
import com.cg.hims.exceptions.PolicyNotFoundException;
import com.cg.hims.service.IPolicyService;


	@RestController
	public class PolicyController {

		@Autowired
		private IPolicyService policyService;
		@RequestMapping(value="/policy/all", method=RequestMethod.GET )
		public List<Policy> getAllPolicy(){
			return policyService.showAllPolicies();
		}
		
		
		
		@RequestMapping(value= "/policy/{id}", method= RequestMethod.GET)
	    public Policy getPolicy(@PathVariable int id)throws PolicyNotFoundException { 
	        Optional<Policy> policy =  policyService.findPolicyById(id);
	        if(!policy.isPresent()) {
	        	throw new PolicyNotFoundException("policy not found for this id"+id);         
	        }
	        else
	            return policy.get();        // returns Employee object with data
	    }
		
		@RequestMapping(value= "/policy/add", method= RequestMethod.POST)
		public Policy addPolicy(@Valid @RequestBody Policy newpolicy) {       
		        return policyService.addPolicy(newpolicy);
		}
		
		@RequestMapping(value= "/policy/update/{id}", method= RequestMethod.PUT)
	    public Policy updatePolicy(@Valid @RequestBody Policy updpolicy, @PathVariable int id)throws PolicyNotFoundException  {
	        Optional<Policy> policy =  policyService.findPolicyById(id);
	        if (!policy.isPresent()) {
	        	throw new PolicyNotFoundException("policy not found for this id"+id);
	        }
	        else  {
	                     updpolicy.setPolicyId(id);
	                     return policyService.updatePolicy(updpolicy);
	        }
		}
		
		
		@RequestMapping(value= "/policy/remove/{id}", method= RequestMethod.DELETE)
		public void removePolicy(@PathVariable int id)throws PolicyNotFoundException  {

		        Optional<Policy> policy =  policyService.findPolicyById(id);
		        if(!policy.isPresent())
		        	throw new PolicyNotFoundException("policy not found for this id"+id);	        else   
		                policyService.removePolicy(id);
		}

		@RequestMapping(value = "/policy/all/bypolicystatus/{status}", method=RequestMethod.GET)
	    public List<Policy>getAllPolicyByStatusType(@PathVariable(value="status") String status)throws PolicyNotFoundException {
	   
	         List<Policy> policies = policyService.getAllPolicyByStatusType(status);
	    if(policies.isEmpty()) {
	        throw new PolicyNotFoundException("Could not find policy with status-" +status);
	    }
	    return policyService.getAllPolicyByStatusType(status);
	    }
		@ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
	        Map<String, String> errors = new HashMap<>();
	    
	        ex.getBindingResult().getFieldErrors().forEach(error ->
	            errors.put(error.getField(), error.getDefaultMessage()));
	        
	        return errors;
	    }
	}

	


