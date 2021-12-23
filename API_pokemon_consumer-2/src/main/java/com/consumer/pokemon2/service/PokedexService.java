package com.consumer.pokemon2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.pokemon2.entities.Pokedex;

@Service
public class PokedexService {
	
	public Pokedex pegarPokemon() {
		
		return new RestTemplate().getForObject("https://pokeapi.co/api/v2/pokemon?limit=20", Pokedex.class);
		
	}

}
