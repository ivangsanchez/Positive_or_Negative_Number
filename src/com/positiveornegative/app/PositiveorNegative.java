package com.positiveornegative.app;

import java.util.Scanner;
public class PositiveorNegative {

	public static void main(String[] args) {
	
		int num=0;
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Input a  number: ");
		num=input.nextInt();
		
		if(num>0)
		{
			System.out.println("The Number is POSITIVE");
		}
		else
		{
			System.out.println("The Number is NEGATIVE");
		}

	}

}
