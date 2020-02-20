package com.learn.microservices.moviecatalogservice.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.microservices.moviecatalogservice.model.CatalogItem;
import com.learn.microservices.moviecatalogservice.model.Movie;
import com.learn.microservices.moviecatalogservice.model.RatingsData;

@RestController
@RequestMapping(value="/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate ; 
	
	@RequestMapping(value="/{userId}")	
	public List<CatalogItem> getCatalog(@PathVariable("userId") String urserId){
			
		//get all rated movie ids 
		List<RatingsData> ratings = new ArrayList<>();
		ratings.add(new RatingsData("1234", 4));
		ratings.add(new RatingsData("4567", 5));
		
		return ratings.stream().map(rating -> {	
			Movie movie = restTemplate.getForObject("", Movie.class);
			return new CatalogItem("Transformers","Test",4);
		}).collect(Collectors.toList());
		
		//each movie id call movie info  service 
		/*return Collections.singletonList(
				new CatalogItem("Transformers","Test",4)		
				);*/
	}
}
