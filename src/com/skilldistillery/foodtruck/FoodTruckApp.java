package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean menu = true;
		
		FoodTruck[]  foodTrucks = new FoodTruck[5];
		
		System.out.println("Welcome to Denvers best food truck App \n ************************************ ");
		
		for(int i =0 ; i < foodTrucks.length; i++) {
			System.out.println("Please Enter Name of Food Truck: ");
			System.out.println();
			System.out.println("If you would like to exit \n Enter \"Quit\" ");
			String truckName = kb.nextLine();
			if(truckName.equals("Quit") || (truckName.equals("quit"))) {
				System.out.println("Thank You \n Goodbye");
				break;
			}
			else {
			System.out.println("Please enter the type of food: ");
			String fType = kb.nextLine();
			
			System.out.println("Please enter a numeric rating for the truck: ");
			int tRating = kb.nextInt();
			kb.nextLine();
			
			FoodTruck ft = new FoodTruck(truckName, fType, tRating);
			foodTrucks[i] = ft;
			}
			
		}
			
		while(menu) {
			System.out.println();
			System.out.println("**********************************");
			System.out.println("*** Please choose a numeric selection from menu ***");
			System.out.println("1. List all food trucks");
			System.out.println("2. See average rating of food trucks");
			System.out.println("3. Display highest rated food truck");
			System.out.println("4. Quit the program");
			System.out.println("**********************************");
			int selection = kb.nextInt();
			
			if(selection == 4) {
				System.out.println("Have a nice day!");
				menu = false;
			}
				
			if(selection == 1) {
				for(int i =0; i < foodTrucks.length; i++) {
					if(foodTrucks[i]== null) {
						break;
					}
					else {
					System.out.println(foodTrucks[i].toString());	
				}
				}		
			
			}
			
			if(selection == 2) {
				int count= 0;
				int sum = 0;
				int avg = 0;
				for(int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] == null) {
						break;
					}
					else {
						
						sum = sum + foodTrucks[i].getRating();
						count++;
						
					}
					avg = sum /count;
				}
				System.out.println("The average rating of the foodtrucks is: " + avg );
				
			}
			
			if (selection == 3) {
			int count= 0;
			int max = foodTrucks[0].getRating();	
			for(int i = 0; i < foodTrucks.length; i++) {
				
				if (foodTrucks[i] == null) {
					break;
				}
				
				else if  (max < foodTrucks[i].getRating()) { 
			        max = foodTrucks[i].getRating();
			        count= i;
			      }
				
			}
			
				System.out.println("The highest rated food truck is:   " + foodTrucks[count].toString());

					 			
			

			
			
			//
			
	}		
}
}
}
