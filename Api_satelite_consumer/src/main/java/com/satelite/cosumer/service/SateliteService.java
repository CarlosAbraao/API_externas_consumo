package com.satelite.cosumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.satelite.cosumer.entities.SateliteEntity;
import com.satelite.cosumer.repository.SateliteRepository;

import antlr.collections.List;


@Service
public class SateliteService {
	
	@Autowired
	SateliteRepository sateliteRepository;

	public void buscaSatelite() {
		
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
	
		SateliteEntity satelite = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544", SateliteEntity.class);
		System.out.println(satelite.toString());
		sateliteRepository.save(satelite);
		
		
		
		
	}

	//public void save(SateliteEntity sateliteEntity) {
		
//.save(sateliteEntity);

			
	//	}
	

}
