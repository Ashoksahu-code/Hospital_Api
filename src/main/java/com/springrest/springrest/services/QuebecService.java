package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Quebec;

public interface QuebecService {
 
	public List<Quebec> getQuebec();
	public Quebec addQuebec(Quebec quebec);
}
