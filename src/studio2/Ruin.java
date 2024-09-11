package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfTries = 0;
		
		System.out.println("What is your start amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance (0-1)?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many days do you want to simulate?");
		int totalSimulations = in.nextInt();
		System.out.println(" ");
		
		for (int i = totalSimulations; i > 0; i--) {
			
		while (startAmount < winLimit && startAmount != 0) {
			if (Math.random() < winChance) {
				startAmount++;
			}
			else { 
				startAmount--;
			}
			numberOfTries++;
		}
		System.out.println(numberOfTries);
		numberOfTries = 0;
		}
		
	}	
	}


