package ApplicationController;

public class Balance implements PointManagement {
	
	public double manage(double balance, double amount) {
		System.out.println("You currently have " + balance + " points.");
		return balance;
	}	
	
}
