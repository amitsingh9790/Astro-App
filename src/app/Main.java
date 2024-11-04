package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("Welcome in Astro...\nEnter your Birth Date: ");
		Scanner sc = new Scanner(System.in);
		int date=0;
		try {
			date = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please enter valid number!");
		}
		System.out.println("Enter your Month: ");
		
		
		String month = sc.next();
		
		if(date>0 && date < 31)
			Astro.getZodiacSign(date, month.toLowerCase());
		else
			System.out.println("Error! Please enter correct input...");
		
		sc.close();		
	}

}
