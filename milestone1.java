package app;
import java.util.Scanner;


public class Product {
	// variables
	private String name;
	private double price;
	private String category;
	private int quanity;
		
		// asseigns variables
		public Product(String name, double price, String category, int quanity)
		{
			super();
			this.name = name;
			this.price = price;
			this.category = category;
			this.quanity = quanity;
			
			
				
		}
		//gets name
		public String getName()
		{
			return name;
		}
		//gets price
		public double getPrice()
		{
			price = quanity * price;
			return price;
		}
		//get category
		public String getCategory()
		{
			return category;
		}
		// gets quanity
		public int getQuanity()
		{
			quanity = quanity *1;
			return quanity;
		}
		
		
		//runs program
		public static void main(String [] args)
		{
			//variables for input
			int input;
			int mult;
			double time;
			int proceed;
			
			//creates object
			Product product = new Product("Sword", 125.65, "Weapon", 1);
			Product product1 = new Product("Computer", 115.70, "Intelligence", 1);
			Product product2 = new Product("Machine Gun", 200.70, "Weapon", 1);
			Product product3 = new Product("Bulletproof Vest", 99.90, "Armor", 1);
			
			//scans in time, and decides whether it is in hours of operation
			Scanner keyboard = new Scanner(System.in);
			System.out.print("What Time is it(military time)? ");
			time = keyboard.nextInt();
			if(time>=900 && time<=1700) {
				System.out.println("The store is open please proceed");
			}
			else {
				System.out.println("the store is closed");
				System.exit(0);
			}
			
			//if open, gets item number, and quanity
			System.out.print("Enter Number of item ");
			input = keyboard.nextInt();
			System.out.print("How Many ");
			mult = keyboard.nextInt();

			
			
			

			// the different product nummbers, this and above will be within a method once we get further into project
			if(input == 1)
			{
				System.out.println("you ordered " +product.getQuanity()*mult+ " "+product.getName());
				System.out.println("That will be " +product.getPrice()*mult);
			}
			if(input == 2)
			{
				System.out.println("you ordered " +product1.getQuanity()*mult+ " "+product1.getName());
				System.out.println("That will be " +product1.getPrice()*mult);
			}
			if(input == 3)
			{
				System.out.println("you ordered " +product2.getQuanity()+ " "+product2.getName());
				System.out.println("That will be " +product2.getPrice());
			}
			if(input == 4)
			{
				System.out.println("you ordered " +product3.getQuanity()*mult+ " "+product3.getName());
				System.out.println("That will be " +product3.getPrice()*mult);
			}
			if(input>4)
			{
				System.out.println("The product you enter is out of stock");
			}
			
			//if you would like to purchase or cancel purchase, this is the start of the act of purchasing, will be in a method
			//furhter down the line
			System.out.println("Please enter 1 if you would like to proceed");
			proceed = keyboard.nextInt();
			
			if(proceed == 1)
			{
				System.out.println("thank you for your purchase");
			}
			else {
				System.out.println("Don't want to purchase? please come back later for more deals");			}
		}
	}


