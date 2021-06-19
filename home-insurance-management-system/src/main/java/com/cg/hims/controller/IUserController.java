package com.cg.hims.controller;


import java.util.HashMap;
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


import com.cg.hims.entities.User;
import com.cg.hims.exceptions.InvalidCredentialException;
import com.cg.hims.service.IUserService;



@RestController

public class IUserController {

@Autowired
private IUserService  userservice;


@RequestMapping(value= "/user/{id}", method= RequestMethod.GET)
public User getUser(@PathVariable int id) throws InvalidCredentialException {
Optional<User> user =  userservice.findUserById(id);
     if(!user.isPresent()) {
         throw new InvalidCredentialException("credential not found for this id"+id);       
    }
    else
         return user.get();       
}



@RequestMapping(value= "/user/add user", method= RequestMethod.POST)
public User addUser( @Valid @RequestBody User user) {       
      return userservice.addUser(user);
}

@RequestMapping(value= "/user/update/{id}", method= RequestMethod.PUT)
public User updateUser(@Valid @RequestBody User upduser, @PathVariable int id) throws InvalidCredentialException {
    Optional<User> user =  userservice.getUser(id);
	 if(!user.isPresent()) {
         throw new InvalidCredentialException("credential not found for this id"+id);       
    }
    else  {
                 upduser.setUserid(id);
                 return userservice.updateUser(upduser);
    }
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