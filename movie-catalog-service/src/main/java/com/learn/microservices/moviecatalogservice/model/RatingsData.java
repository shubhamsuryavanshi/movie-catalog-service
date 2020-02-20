package com.learn.microservices.moviecatalogservice.model;

import lombok.Data;

@Data
public class RatingsData {
	String movieId;
	int ratings;
	
	public RatingsData(String movieId, int ratings) {
		this.movieId = movieId;
		this.ratings = ratings;
	}
}
