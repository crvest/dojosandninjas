package com.chadvest.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dojos")
public class RootController
{
	public RootController()
	{
		
	}

	@GetMapping("")
	public String index()
	{
		return "newdojo";
	}
};