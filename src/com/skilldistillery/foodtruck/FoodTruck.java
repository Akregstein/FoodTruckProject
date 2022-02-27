package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String name;
	private String food;
	private int rating;
	private int numericId;
	private static int nextNumericId = 0;

	public String toString() {
		String output = "Truck name: " + name + ", Food type: " + food + ", User Rating: " + rating + ", Truck Numeric Id: " + numericId;
				
		return output;
	}
	
	public void truckInfo() {
		String truckInfo = this.toString();
		System.out.println(truckInfo);
	}
		
	public FoodTruck() {

	}

	public FoodTruck(String name, String food, int rating) {
		this.name = name;
		this.food = food;
		this.rating = rating;
		this.numericId = nextNumericId;
		 nextNumericId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfood() {
		return food;
	}

	public void setFood(String food) {
		this.name = food;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int numericId() {
		return numericId;
	}

	public void numericId(int numericId) {
		this.numericId = numericId;
	}



	}

