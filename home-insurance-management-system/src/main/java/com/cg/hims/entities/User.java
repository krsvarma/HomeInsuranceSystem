package com.cg.hims.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Component
@Entity
@Table(name="User_Details")
public class User {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

 @NotEmpty(message = "User name is required")
 @NotNull
 @Size(max=20)
 @Pattern(regexp="^[a-zA-Z]{3}",message="length must be 3") 
	private String userName;
 
 @NotEmpty(message = "Password is required")
 @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3") 
 @NotNull
 
 private String password;
 
 @NotEmpty(message = "Role is required")
 @NotNull
 @Size(max=20)
	private String role;
 
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(int userid,
			@NotEmpty(message = "User name is required") @NotNull @Size(max = 20) @Pattern(regexp = "^[a-zA-Z]{3}", message = "length must be 3") String userName,
			@NotEmpty(message = "Password is required") @Pattern(regexp = "^[a-zA-Z0-9]{3}", message = "length must be 3") @NotNull String password,
			@NotEmpty(message = "Role is required") @NotNull @Size(max = 20) String role) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}



	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}

}