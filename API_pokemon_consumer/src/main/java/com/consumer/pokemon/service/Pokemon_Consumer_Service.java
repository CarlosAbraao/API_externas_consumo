package com.consumer.pokemon.service;




import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.pokemon.entities.Pokemon;


@Service
public class Pokemon_Consumer_Service {
	
	
public void buscaPokemon() {
		
		
		ResponseEntity<Pokemon> entity = new RestTemplate().getForEntity("https://pokeapi.co/api/v2/", Pokemon.class);
		
		System.out.println(entity.getBody());
		
		
		
		
		ResponseEntity<Object> poEntity = new RestTemplate().getForEntity("https://pokeapi.co/api/v2/pokemon?limit=20",Object.class);
		System.out.println(poEntity);
		
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
	
		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?limit=2", Pokemon.class);
		System.out.println("Nome do Pokemon: " + pokemon.getResults());
		
		
		
		
		
		
	}
}
