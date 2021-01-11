package com.lp.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.lp.graphql.controller"})
public class SpringBootGraphqlGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlGradleApplication.class, args);
	}

}
