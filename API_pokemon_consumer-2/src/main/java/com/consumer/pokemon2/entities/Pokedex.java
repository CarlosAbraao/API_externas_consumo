package com.consumer.pokemon2.entities;

import java.util.List;

public class Pokedex {
	
	private List<Pokemon> results;

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Pokedex [results=" + results + "]";
	}
	
	
	

}
