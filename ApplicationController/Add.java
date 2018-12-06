package ApplicationController;

public class Add implements PointManagement {
	
	public double manage(double balance, double amount) {
		System.out.println("You have added " + amount + " points. Well done!");
		return balance+amount;
	}
}
