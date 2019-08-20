package Greens;

import java.util.Scanner;

public class facto {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the values");
		
		int j = sc.nextInt();
		int factorial=1;
		for(int i=1;i<=j;i++)
		{
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		}}
		
