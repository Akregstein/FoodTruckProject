package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
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
			
		
			System.out.println("Please choose a numeric selection from menu");
			System.out.println("1. List all food trucks");
			System.out.println("2. See average rating of food trucks");
			System.out.println("3. Display highest rated food truck");
			System.out.println("4. Quit the program");
			int selection = kb.nextInt();
			
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
				
			}
			
			
			
			
			
	}		
}
		
		 
				
		
		 
	


