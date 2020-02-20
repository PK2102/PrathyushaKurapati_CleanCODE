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
		int principal,rate,time;
		System.out.println("Enter the principal amount");
		principal = scan.nextInt();
		System.out.println("Enter the rate of interest");
		rate  = scan.nextInt();
		System.out.println("Enter the duration of time");
		time = scan.nextInt();
		
		Functionalites ob = new Functionalites();
		
		
		System.out.println("Simple Interest is: "+ob.simpleInterest(principal,rate,time));
		System.out.println("Compound Interest is:"+ob.compoundInterset(principal,rate,time));
	}
    public static void main( String[] args )
    {
        Main();
    }
}
