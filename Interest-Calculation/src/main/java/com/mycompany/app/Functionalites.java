package com.mycompany.app;

public class Functionalites {
	public int simpleInterest(int principal,int rate,int time)
	{
		return principal*rate*time;
	}
	public int compoundInterset(int principal,int rate,int time)
	{
		return (int) Math.pow((principal*(1+(rate/100))),time);
	}

}
