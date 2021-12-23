package com.consumer.pokemon2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.consumer.pokemon2.service.PokedexService;


@RestController
public class PokemonController {
	
	
	@RequestMapping("/")
	public ModelAndView home()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}

	@RequestMapping("/chama2")
	public String index() {
		System.out.println("Ja passou por aqui2");
		return "index.html";
		
	}
	
	@GetMapping("/chama")
	public String pagina() {
		System.out.println("Ja passou por aqui");
		return "index";
		
	}

}
