package com.cg.ems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ems.dto.UserDto;
import com.cg.ems.exception.UserException;
import com.cg.ems.service.ILoginServiceImpl;

@RestController
@RequestMapping("/ems")
public class UserController {
	@Autowired
	ILoginServiceImpl service;
	
	@GetMapping("/login/{id}/{pwd}/{role}")
	public UserDto validateUser(@PathVariable("id") int id,@PathVariable("pwd") String passWord, @PathVariable("role") String role) throws UserException {
		UserDto user=new UserDto();
		user.setUserId(id);
		user.setPassWord(passWord);
		user.setRole(role);
		return service.validateUser(user);
}
}
