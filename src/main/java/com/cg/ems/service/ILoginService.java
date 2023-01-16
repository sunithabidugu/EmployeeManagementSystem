package com.cg.ems.service;


import com.cg.ems.dto.UserDto;
import com.cg.ems.exception.UserException;


public interface ILoginService {
	public UserDto validateUser(UserDto user) throws UserException;
}
