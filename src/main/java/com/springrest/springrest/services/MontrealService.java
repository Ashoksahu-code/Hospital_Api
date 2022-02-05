package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.springrest.springrest.entity.Montreal;
import com.springrest.springrest.entity.Quebec;

public interface MontrealService {
	
	public List<Montreal> getMontreal();
	//public Montreal getMontreal(String Montreal_Id);
	public Montreal addMontreal(Montreal montreal);
    //public Course updateCourse(Course course);
    //public void deleteCourse(long parseLong);
	
}
