package com.chadvest.dojosandninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chadvest.dojosandninjas.models.Ninja;
import com.chadvest.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepository;
	
	// create/update
	public void create(Ninja ninja)
	{
		ninjaRepository.save(ninja);
	}
	
	
	public Ninja findById(Long id)
	{
		return ninjaRepository.findById(id).orElse(null);
	}
	
	public ArrayList<Ninja> findAll()
	{
		return ninjaRepository.findAll();
	}

	
	public void deleteById(Long id)
	{
		ninjaRepository.deleteById(id);
	}
	
}
