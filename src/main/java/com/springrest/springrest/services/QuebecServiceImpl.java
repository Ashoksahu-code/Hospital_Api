package com.springrest.springrest.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.dao.QuebecDao;
import com.springrest.springrest.entity.Montreal;
import com.springrest.springrest.entity.Quebec;

@Service
public class QuebecServiceImpl implements QuebecService{

	@Autowired
	private CourseDao courseDao;
	
	List<Quebec> listQuebec;
	HashMap<String, Object> map = new HashMap<String, Object>();
	
	public QuebecServiceImpl()
	{
	    
	    listQuebec.add(new Quebec("UUEM012221","Physician",10));
	    listQuebec.add(new Quebec("UUEM012221","Physician",11));
 		
		//HashMap<String, Object> map = new HashMap<String, Object>();
		
		//map.put("MTLM0102221",new Course("MTLM0102221","Physician",10));
		//map.put("MTLA0104221",new Course("MTLA0104221","Physician",10));
	}
	@Override
	public List<Quebec> getQuebec() {
		//return courseDao.findAll();
		return listQuebec;
	}
    @Override
	public Quebec addQuebec(Quebec quebec) {
		listQuebec.add(quebec);
		//courseDao.save(course);
		return quebec;
	}

	
}
