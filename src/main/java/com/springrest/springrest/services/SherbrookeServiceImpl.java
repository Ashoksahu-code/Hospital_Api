package com.springrest.springrest.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.entity.Sherbrooke;

@Service
public class SherbrookeServiceImpl implements SherbrookeService{
	
	
	List<Sherbrooke> listSherbrooke;
	HashMap<String, Object> map = new HashMap<String, Object>();
	
	public SherbrookeServiceImpl()
	{
		
		listSherbrooke.add(new Sherbrooke("SHEM012221","Physician",10));
		listSherbrooke.add(new Sherbrooke("SHEA012221","Surgeon",10));
	    
	   //HashMap<String, Object> map = new HashMap<String, Object>();
		
		//map.put("MTLM0102221",new Course("MTLM0102221","Physician",10));
		//map.put("MTLA0104221",new Course("MTLA0104221","Physician",10));
	}

	@Override
	public List<Sherbrooke> getSherbrooke() {
		// TODO Auto-generated method stub
		return listSherbrooke;
	}

	@Override
	public Sherbrooke addSherbrooke(Sherbrooke sherbrooke) {
		listSherbrooke.add(sherbrooke);
		//courseDao.save(course);
		return sherbrooke;
	}

}
