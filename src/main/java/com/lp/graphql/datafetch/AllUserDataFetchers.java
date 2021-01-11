package com.lp.graphql.datafetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lp.graphql.entity.User;
import com.lp.graphql.repository.UserRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllUserDataFetchers implements DataFetcher<List<User>>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> get(DataFetchingEnvironment environment) {
		return userRepository.findAll();
	}
	
}
