package com.lp.graphql.dto;

import lombok.Data;

@Data
public class CreateUserDto {
	private String userName;
	private String userEmail;
	private String userMobile;
}
