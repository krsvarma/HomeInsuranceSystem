package com.cg.hims.service;


import java.util.List;
import java.util.Optional;

import com.cg.hims.entities.Policy;


public interface IPolicyService {

	public Policy addPolicy(Policy policy);

	public Policy updatePolicy(Policy policy); 
	
	public  Optional <Policy> findPolicyById(int policyId);
	public void removePolicy(int policyId) ;

	public List<Policy> showAllPolicies();
	public List<Policy> getAllPolicyByStatusType(String status);

}


