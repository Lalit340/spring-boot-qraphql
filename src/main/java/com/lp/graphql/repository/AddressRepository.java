package com.lp.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp.graphql.entity.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
