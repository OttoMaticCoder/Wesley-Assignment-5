package com.coderscamp.arraylist;

import java.util.Arrays;

public class CustomListApplication {
	
	public static <T> void main(String[] args) {
		
		CustomList<String> eliteWrestlers = new CustomArrayList<>(); 
		
		eliteWrestlers.add("Kyle Dake");
		eliteWrestlers.add("David Taylor");
		eliteWrestlers.add("Kyle Snyder");
		eliteWrestlers.add("Jordan Burroughs");
		eliteWrestlers.add("John Smith");
		eliteWrestlers.add("Bruce Baumgartner");
		eliteWrestlers.add("Cael Sanderson");
		eliteWrestlers.add("Dan Gable");
		eliteWrestlers.add("Tom Brands");
		eliteWrestlers.add("Gable Steveson");
		eliteWrestlers.add("Jamie Varner");
		eliteWrestlers.add("Kurt Angle");
		
		System.out.println(eliteWrestlers.getSize());
		System.out.println("___________");
		System.out.println(eliteWrestlers.get(10));
		
//		myNumbList();
		
		
		


        

	}

	private static void myNumbList() {
		CustomList<Integer> myCustomList = new CustomArrayList<>(); 
		
		for (int i = 0; i < 55; i++) {
			myCustomList.add(i);
			System.out.println(myCustomList.getSize());
		}
		System.out.println("___________");
		System.out.println(myCustomList.get(40));
	}

}
