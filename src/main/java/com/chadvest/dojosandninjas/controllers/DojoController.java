package com.chadvest.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chadvest.dojosandninjas.models.Dojo;
import com.chadvest.dojosandninjas.services.DojoService;
import com.chadvest.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/dojo")
public class DojoController 
{
	@Autowired
	private DojoService dojoService;
	
	@Autowired 
	private NinjaService ninjaService;
	
	// show all ninjas at one dojo
	@GetMapping("/{id}")
	public String findDojoById(@PathVariable("id") Long id, Model model)
	{
		model.addAttribute("dojo", dojoService.findById(id));
		model.addAttribute("ninjas", ninjaService.findAll());
		return "showninjas";
	}
	
	
	@GetMapping("/new")
	public String newDojo(Model model)
	{
		model.addAttribute("dojo", new Dojo());
		return "newdojo";
	}
	
	@PostMapping("/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res)
	{
		if(res.hasErrors())
		{
			return "newdojo";
		}
		dojoService.create(dojo);
		return "redirect:/ninja/new";
	}
	
	

}
