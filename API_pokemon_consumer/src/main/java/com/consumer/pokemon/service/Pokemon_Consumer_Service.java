package com.consumer.pokemon.service;




import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.pokemon.entities.Pokemon;


@Service
public class Pokemon_Consumer_Service {
	
	
public void buscaPokemon() {
		
		// TESTE DE METODOS
		ResponseEntity<Pokemon> entity = new RestTemplate().getForEntity("https://pokeapi.co/api/v2/", Pokemon.class);
		
		System.out.println(entity.getBody());
		
		
		// METODO 2
		ResponseEntity<Object> poEntity = new RestTemplate().getForEntity("https://pokeapi.co/api/v2/pokemon?limit=20",Object.class);
		System.out.println(poEntity);
		
		
		// METODO 3
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?limit=2", Pokemon.class);
		System.out.println("Nome do Pokemon: " + pokemon.getResults());
		
		//AINDA N CORRIGI O ERRO DOS DOIS METODOS
		// OBJETOS DENTRO DE UMA LISTA - E UMA FORMA NÃO MUITO ATUAL
//		Pokemon[] pokem = new RestTemplate().getForObject("https://pokeapi.co/api/v2/pokemon?limit=2", Pokemon[].class);
//		
//		System.out.println(Arrays.toString(pokem));
		
		
//		ResponseEntity<List<Pokemon>> exchange =new  RestTemplate().exchange("https://pokeapi.co/api/v2/pokemon?limit=2", HttpMethod.GET,null,
//				new ParameterizedTypeReference<List<Pokemon>>(){});
//		
//		System.out.println(exchange.getBody());
		
		
	}
}
