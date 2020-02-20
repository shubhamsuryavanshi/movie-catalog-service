package com.learn.microservices.moviecatalogservice.model;

import lombok.Data;

@Data
public class CatalogItem {

	private String name;
	private String desc;
	private Integer ratings;
	
	public CatalogItem(String name,String desc,int ratings) {
		this.name = name; 
		this.desc = desc;
		this.ratings = ratings;
	}
}
