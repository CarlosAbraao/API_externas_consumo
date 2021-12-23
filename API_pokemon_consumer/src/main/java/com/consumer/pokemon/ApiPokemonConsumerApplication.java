package com.consumer.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consumer.pokemon.controller.PokemonController;
import com.consumer.pokemon.service.Pokemon_Consumer_Service;

@SpringBootApplication
public class ApiPokemonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPokemonConsumerApplication.class, args);
		
		Pokemon_Consumer_Service p = new Pokemon_Consumer_Service();
		p.buscaPokemon();
		
	}

}
