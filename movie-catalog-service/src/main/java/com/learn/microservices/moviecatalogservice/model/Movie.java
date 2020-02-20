package com.learn.microservices.moviecatalogservice.model;

import lombok.Data;

@Data
public class Movie {
	String movieId;
	String name;
	
	public  Movie (String movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}
	
	/*public static void main( String args [] ) {
		int [] plate = {1,2,2,3,4,5};
		int left = 0;
		int right = plate.length-1;
		
		System.out.println(left + "," + right);
		Movie m = new Movie("","");
		System.out.println(m.binarySearch(plate, left, right, 4));
	}
	
	int binarySearch(int arr[] , int l, int r , int x) {
		if(r>=l) {

			int mid = l + (r-l)/2;
			System.out.println("mid " + mid);
			if(arr[mid] == x)
				return mid;
			
			if( x < arr[mid] ) {
				return binarySearch(arr, l, mid-1, x);
				
			}else {
				return binarySearch(arr, mid+1, r, x);
			}

			
		}return -1;
		
	}*/
}