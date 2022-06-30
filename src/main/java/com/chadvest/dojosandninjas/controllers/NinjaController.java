package com.chadvest.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chadvest.dojosandninjas.models.Ninja;
import com.chadvest.dojosandninjas.services.DojoService;
import com.chadvest.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController 
{
	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
	public String newNinja(Model model)
	{
		model.addAttribute("ninja", new Ninja());
		model.addAttribute("dojos", dojoService.findAll());
		return "newninja";
	}
	
	@PostMapping("/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult res)
	{
		if(res.hasErrors())
		{
			return "newninja";
		}
		ninjaService.create(ninja);
		return "redirect:/ninja/new";
	}

	
	

}
