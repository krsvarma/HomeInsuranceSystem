package com.cg.hims.service;

import java.util.List;
import java.util.Optional;

import com.cg.hims.entities.Agent;


public interface IAgentService {
	public Agent addAgent(Agent agent);
	public List<Agent> viewAllAgents();
	public Optional<Agent> findAgentById(int agentId);
	public Agent updateAgent(Agent agent);
	public void removeAgent(int agentId);
	public List<Agent> getAllAgentsByDesignation(String desg);
	//public List<Agent> getAllAgentsByName(String name);
	public List<Agent> getAllAgentsByagentName(String name);

}
