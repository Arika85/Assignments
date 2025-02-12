package com.assigments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		
		// Temperature of a city in degrees Celsius
		float temperature = 25.5f;
		System.out.println("Temperature of City in degrees Celsius : " + temperature);

		// Whether a customer has placed an order: true or false
		boolean orderPlaced = true;
		boolean orderNotPlaced = false;
		System.out.println("whether customer placed an order : " + orderPlaced + " or " + orderNotPlaced);
		System.out.println("If customer placed an order : " + orderPlaced);
		System.out.println("If customer not placed an order : " + orderNotPlaced);

		// Person's phone number: "123-456-7890"
		String phoneNumber = "123-456-7890";
		System.out.println("Peron's Phone number : " + phoneNumber);

		// Amount of money in a customer's bank account: 1000.50
		float money = 1000.50f;
		System.out.println("Amount of money in a customer's bank account : " + money);

		// Person's email address: "john.doe@example.com"
		String emailAdd = "john.doe@example.com";
		System.out.println("Person's email address: " + emailAdd);
		
		// Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		float lattitude = 37.7749f;
		float longitude = -122.4194f;
		String latLong = "37.7749f, -122.4194f";
		System.out.println("Coordinates of a location (latitude, longitude): " + latLong);
		System.out.println("Lattitude of a location : " + lattitude);
		System.out.println("Longitude of a location : " + longitude);
		System.out.println("Coordinates of a location (latitude, longitude): " + lattitude + ", " + longitude);
		System.out.println("Coordinates of a location (latitude, longitude): " + latLong);
		
		// Person's marital status: true or false
		boolean married = true;
		boolean unmarried = false;
		System.out.println("Person's marital status : " + married + " or " + unmarried);
		
		// Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		System.out.println("Person's occupation: " + occupation);
		

		// Person's favourite colour: "Blue"
		String color = "Blue";
		System.out.println("Person's favourite colour: " + color);
		

		// Current year: 2023
		int year = 2023;
		System.out.println("Current year : " + year);
		

		// Number of followers on a social media platform: "1,000,000"
		String followers = "1,000,000";
		int mediaFollowers = 1000000;
		
		System.out.println("Number of followers on a social media platform:" + followers);
		System.out.println("Number of followers on a social media platform:" + mediaFollowers);
		
		// %,d ------ % indicates start of a format specifier
		// where , adds comma as thousands separator
		// d  indicates argument is a decimal integer
		// %n prints new line character
		System.out.printf("Number of followers on a social media platform: %,d%n ", mediaFollowers);  

		// Rating of a movie: 7.5
		float rating = 7.5f;
		System.out.println("Rating of a movie: " + rating);
		System.out.printf("Rating of a movie: %.1f%n", rating);   //%n is line break
		

		// Person's blood type: 'A'
		char bloodType = 'A';
		System.out.println("Person's blood type: " + bloodType);
		

		// Title of a book: "To Kill a Mockingbird"
		String title = "To Kill a Mockingbird";
		System.out.println("Title of a book: " + title);
		System.out.format("Title of a book: %s%n", title);
		System.out.printf("Title of a book: %s%n", title);
		

		// Number of employees in a company: 500
		int employees = 500;
		System.out.println("Number of employees in a company: " + employees);
		System.out.format("Number of employees in a company: %d%n", employees);
		

		// Time of an event: "2:30 PM"
		String time = "2:30 PM"; 
		System.out.println("Time of an event: " + time);
		

		// Name of a country: "United States"
		String country = "United States";
		System.out.println("Name of a country: " + country);
		

		// Person's eye color: "Brown"
		String eyeColor = "Brown";
		System.out.println("Person's eye color: " + eyeColor);
		

		// Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("Person's birthplace: " + birthPlace);
		

		// Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.println("Distance between two cities : " + distance);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
