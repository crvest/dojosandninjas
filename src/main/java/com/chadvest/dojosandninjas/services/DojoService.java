package com.chadvest.dojosandninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chadvest.dojosandninjas.models.Dojo;
import com.chadvest.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService 
{
	@Autowired
	private DojoRepository dojoRepository;
	
	// create/update
	public void create(Dojo dojo)
	{
		dojoRepository.save(dojo);
	}
	
	
	public Dojo findById(Long id)
	{
		return dojoRepository.findById(id).orElse(null);
	}
	
	public ArrayList<Dojo> findAll()
	{
		return dojoRepository.findAll();
	}
	
	public void deleteById(Long id)
	{
		dojoRepository.deleteById(id);
	}
	
	
}
