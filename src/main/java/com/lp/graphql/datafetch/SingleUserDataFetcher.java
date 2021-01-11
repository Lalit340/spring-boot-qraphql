package com.lp.graphql.datafetch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lp.graphql.entity.User;
import com.lp.graphql.repository.UserRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class SingleUserDataFetcher implements DataFetcher<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User get(DataFetchingEnvironment dataFetchingEnvironment) {
		int userId = Integer.parseInt(dataFetchingEnvironment.getArgument("userId"));
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("No user exist with user id " + userId));
		return user;
	}

}
