package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Montreal;

@Service
public class MontrealServiceImpl implements MontrealService {
    
	
	@Autowired
	private CourseDao courseDao;
	List<Montreal> list;
	HashMap<String, Object> map = new HashMap<String, Object>();
	
	public MontrealServiceImpl()
	{
		list= new ArrayList<>();
	    list.add(new Montreal("MTLM012221","Physician",10));
	    list.add(new Montreal("MTLA012221","Surgeon",10));
 		
		//HashMap<String, Object> map = new HashMap<String, Object>();
		
		//map.put("MTLM0102221",new Course("MTLM0102221","Physician",10));
		//map.put("MTLA0104221",new Course("MTLA0104221","Physician",10));
	}
	
	@Override
	public List<Montreal> getMontreal() {
		// TODO Auto-generated method stub
		//return courseDao.findAll();
		return list;
	}

	@Override
	public Montreal addMontreal(Montreal montreal) {
		list.add(montreal);
		//courseDao.save(course);
		return montreal;
	}
	

}
