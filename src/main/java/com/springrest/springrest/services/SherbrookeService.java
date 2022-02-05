package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Quebec;
import com.springrest.springrest.entity.Sherbrooke;

public interface SherbrookeService {

	public List<Sherbrooke> getSherbrooke();
	public Sherbrooke addSherbrooke(Sherbrooke sherbrooke);
}
