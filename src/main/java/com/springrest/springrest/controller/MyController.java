package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Montreal;
import com.springrest.springrest.entity.Quebec;
import com.springrest.springrest.entity.Sherbrooke;
import com.springrest.springrest.services.MontrealService;
import com.springrest.springrest.services.QuebecService;
import com.springrest.springrest.services.SherbrookeService;

@RestController
@CrossOrigin(origins="http://localhost:3000")

public class MyController {
	@Autowired
	private MontrealService ms;
	@Autowired
	private QuebecService qs;
	@Autowired
	private SherbrookeService ss;
	
	@GetMapping("/Montreal")
	public List<Montreal> getMontreal()
	{
		return this.ms.getMontreal();	
	}
	
	@PostMapping("/Montreal")
	public Montreal addMontreal(@RequestBody Montreal montreal)
	{
		return this.ms.addMontreal(montreal);
	}
	
	// Quebec Hospital
	
	@GetMapping("/Quebec")
	public List<Quebec> getQuebec()
	{
		return this.qs.getQuebec();	
	}
	
	@PostMapping("/Quebec")
	public Quebec addMontreal(@RequestBody Quebec quebec)
	{
		return this.qs.addQuebec(quebec);
	}
  
    // Sherbrooke Hospital
	
	@GetMapping("/Sherbrooke")
	public List<Sherbrooke> getSherbrooke()
	{
		return this.ss.getSherbrooke();	
	}
	
//	@GetMapping("/Montreal/{Montreal_Id}")
//	public Montreal getMontreal_Id(@PathVariable String Montreal_ID)
//	{
//		return this.cs.getMontreal(Long.parseLong(Montreal_ID));
//	}
	
	@PostMapping("/Sherbrooke")
	public Sherbrooke addSherbrooke(@RequestBody Sherbrooke sherbrooke)
	{
		return this.ss.addSherbrooke(sherbrooke);
	}
	
}
