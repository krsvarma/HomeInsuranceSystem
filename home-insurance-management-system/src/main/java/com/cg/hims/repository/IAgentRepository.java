package com.cg.hims.repository;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hims.entities.Agent;


@Repository
public interface IAgentRepository extends JpaRepository<Agent, Integer> {
	List<Agent> findByDesignation(String designation);

	List<Agent> findByAgentName(String name);

	//List<Agent> findByName(String name);
}
