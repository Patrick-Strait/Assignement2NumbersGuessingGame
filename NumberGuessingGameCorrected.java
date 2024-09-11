package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameCorrected {

	public static void main(String[] args) {

		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;

		int attempts = 5;

		try (Scanner scanner = new Scanner(System.in)) {
			while (attempts > 0) {
				System.out.print("Pick a number between 1 and 100: ");

				int guess = scanner.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again.");
					continue;
				}

				if (guess == randomNumber) {

					System.out.println("You win!");
					return;
				}
				

				else if (guess < randomNumber) {
					System.out.println("Please pick a higher number.");
				}

				else {
					System.out.println("Please pick a lower number.");
				}
				
				attempts--;
				if (attempts == 0) {
					System.out.println("You lose!");
					System.out.println("The number to guess was: " + randomNumber);
				}
				
			}
		}

	}
	
}
