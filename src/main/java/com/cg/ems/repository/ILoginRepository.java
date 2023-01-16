package com.cg.ems.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.UserDto;
@Repository
public interface ILoginRepository extends JpaRepository<UserDto, Integer>{
	
	@Query("select user from UserDto user where user.userId=:id and user.passWord=:pwd and user.role=:rl" )
	public UserDto validateUser(@Param("id") int id,@Param("pwd")String pwd,@Param("rl")String role); 

}

