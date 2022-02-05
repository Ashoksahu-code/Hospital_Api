package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Montreal;

public interface CourseDao extends JpaRepository<Montreal, String>{

	Montreal getOne(String montreal_Id);
}
