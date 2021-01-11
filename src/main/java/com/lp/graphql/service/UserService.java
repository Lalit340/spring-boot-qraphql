package com.lp.graphql.service;

import com.lp.graphql.dto.CreateUserDto;

public interface UserService {
	
	
	public String createUser(CreateUserDto createUserDto);
	public String addAddressToUser(int userId,int addressId);
}