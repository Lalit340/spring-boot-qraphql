package com.lp.graphql.datafetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lp.graphql.entity.Address;
import com.lp.graphql.repository.AddressRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllAddressDataFetcher implements DataFetcher<List<Address>>{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> get(DataFetchingEnvironment environment) {
		return addressRepository.findAll();
	}

}
