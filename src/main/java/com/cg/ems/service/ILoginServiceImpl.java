package com.cg.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dto.UserDto;
import com.cg.ems.exception.UserException;
import com.cg.ems.repository.ILoginRepository;


@Service
public class ILoginServiceImpl implements ILoginService{
	@Autowired
	ILoginRepository repository;
	
	@Override
	public UserDto validateUser(UserDto user) throws UserException {
		// TODO Auto-generated method stub
		UserDto userDto=repository.validateUser(user.getUserId(),user.getPassWord(),user.getRole());
		if(userDto!=null) {
			userDto.setResult(1);
			return userDto;
		}
		else {
			throw new UserException("Invalid Username or password");
		}
			
		
	}

}
