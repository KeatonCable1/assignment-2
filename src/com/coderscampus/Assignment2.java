package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomnumber = random.nextInt(100)+1;
		Scanner scanner = new Scanner(System.in);
		
		int numberofguesses = 5;
		
		while(numberofguesses > 0) {
			System.out.println("Pick a number between 1 and 100: ");
			int guess = scanner.nextInt();
			
			if(guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again: ");
				continue;}
			
			if(guess == randomnumber) {
				System.out.println("You Win!");
				break;}
			
			else if(guess < randomnumber) {
				System.out.println("Pick a higher number");
			}
			else {
				System.out.println("Pick a lower number");
			}
			numberofguesses--;
			if(numberofguesses == 0) {
				System.out.println("You Lose!");
				System.out.println("The number to guess was: " + randomnumber);
			}
			
		}
		
	}
	
}
