package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void Main()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the material standard you want");
		System.out.println("1.Standard material");
		System.out.println("2.Above standard material");
		System.out.println("3.High standard");
		System.out.println("4. High standard Automation Home");
		System.out.println("Enter your choice");
		int choice;
		choice =  scan.nextInt();
		System.out.println("Enter the total area of the home");
		float total_area = scan.nextFloat();
		float total_cost  = 0.0f;
		Functions object1 = new Functions();
		switch(choice)
		{
		case 1:
			total_cost  = object1.constructioncost(1200, total_area);
			break;
		case 2:
			total_cost  = object1.constructioncost(1500, total_area);
			break;
		case 3:			
			total_cost = object1.constructioncost(1800, total_area);			
			break;
		case 4:
			total_cost = object1.constructioncost(2500, total_area);
			break;
		default:
			System.out.println("The choice you made is currently not available");
			break;
			
				
		}
		System.out.println("The total construction cost is "+total_cost);
		
		
	}
    public static void main( String[] args )
    {
        Main();
    }
}
