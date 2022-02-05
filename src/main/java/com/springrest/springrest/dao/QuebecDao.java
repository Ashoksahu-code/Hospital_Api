package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Quebec;

public interface QuebecDao extends JpaRepository<Quebec, String>{

	
	Quebec getOne(String Quebec_Id);
}
