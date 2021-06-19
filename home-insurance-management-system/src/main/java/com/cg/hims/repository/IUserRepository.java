package com.cg.hims.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hims.entities.User;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	//public User save(User newuser);

	void save(int userid);

	


}
