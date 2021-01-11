package com.lp.graphql.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.graphql.dto.CreateUserDto;
import com.lp.graphql.entity.Address;
import com.lp.graphql.entity.User;
import com.lp.graphql.repository.AddressRepository;
import com.lp.graphql.repository.UserRepository;
import com.lp.graphql.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public String createUser(CreateUserDto createUserDto) {
		User user = modelMapper.map(createUserDto, User.class);
		userRepository.save(user);
		return "User created successfully";
	}
	
	public String addAddressToUser(int userId,int addressId) {
		User user= userRepository.findById(userId).get();
		Address address = addressRepository.findById(addressId).get();
		user.getAddresses().add(address);
		userRepository.save(user);
		return "Address added to user";
	}
}
