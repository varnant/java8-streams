package com.mystreams;

import java.util.Arrays;
import java.util.List;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> mymoviesList=Arrays.asList(new Movie("M1",2020,"Rajini"),new Movie("M2",2021,"Rajini"));
		mymoviesList.stream()
		            .filter(m->m.getYear()==2021)//filter is an intermediate operation
		            .map(m->m.getName())//map is an intermediate operation
		            .forEach(System.out::println);//for each is the terminal operation
		//method ref in .map -instead of using Lamda 
		mymoviesList.stream()
        .filter(m->m.getYear()==2021)
        .map(Movie::getName)// instead of lamda i have used method ref getName() in Movie bean
        .forEach(System.out::println);
	}

}
