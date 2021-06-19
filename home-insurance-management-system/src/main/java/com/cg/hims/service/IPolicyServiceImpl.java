package com.cg.hims.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hims.entities.Policy;
import com.cg.hims.repository.IPolicyRepository;



@Service
public class IPolicyServiceImpl implements IPolicyService {
	
	@Autowired
    private IPolicyRepository policyRepo;

	@Override
	public Policy addPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepo.save(policy);
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepo.save(policy);
	}

	@Override
	public Optional<Policy> findPolicyById(int policyId) {
		// TODO Auto-generated method stub
		return policyRepo.findById(policyId);
	}

	@Override
	public void removePolicy(int policyId) {
		// TODO Auto-generated method stub
		 policyRepo.deleteById(policyId) ;
	}

	@Override
	public List<Policy> showAllPolicies() {
		// TODO Auto-generated method stub
		return policyRepo.findAll();
	}

	@Override
	public List<Policy> getAllPolicyByStatusType(String status) {
		
		return policyRepo.findByPolicyStatus(status);
	}
	

}
