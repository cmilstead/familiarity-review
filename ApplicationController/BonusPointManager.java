package ApplicationController;

import java.util.Scanner;

public class BonusPointManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Controller bank = new Controller();
		double balance = (int)((Math.random() * 1000) + 100);
		double amount;
		String request;
		
		System.out.println("BonusPointManager: Welcome.");
		System.out.println("What would you like to do?");
		System.out.println("BALANCE | DEDUCT | ADD | EXIT");

		request = input.nextLine();

		while (request != "EXIT") {

			switch(request) {

				case "BALANCE":
					balance = bank.handleRequest(request, balance, 0);
					break;

				case "DEDUCT": case "ADD":
					System.out.println("Please enter the amount of points");
					amount = Integer.parseInt(input.nextLine());
					balance = bank.handleRequest(request, balance, amount);
					break;

				default:
					System.out.println("Please enter a valid option.");
					break;
			}

			System.out.println("BALANCE | DEDUCT | ADD | EXIT");
			request = input.nextLine();
		}
		
		System.out.println("Thank you for your business. Goodbye.");
	}

}
