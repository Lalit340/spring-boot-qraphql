package com.lp.graphql.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.graphql.dto.CreateAddressDto;
import com.lp.graphql.entity.Address;
import com.lp.graphql.repository.AddressRepository;
import com.lp.graphql.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public String createAddress(CreateAddressDto createaddressDto) {
		Address address = modelMapper.map(createaddressDto, Address.class);
		addressRepository.save(address);
		return "Address added";
	}

}
