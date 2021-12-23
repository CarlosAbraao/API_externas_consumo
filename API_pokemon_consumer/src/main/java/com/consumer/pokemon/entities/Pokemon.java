package com.consumer.pokemon.entities;

import java.util.List;
import java.util.Objects;

public class Pokemon {
	
	private Integer count;
	private String next;
	private String previous;
	private List<Object> results;
	private String name;
	private String url;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<Object> getResults() {
		return results;
	}
	public void setResults(List<Object> results) {
		this.results = results;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Pokemon [count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results
				+ ", name=" + name + ", url=" + url + "]";
	}
	
	
	
}
