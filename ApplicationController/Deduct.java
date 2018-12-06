package ApplicationController;

public class Deduct implements PointManagement {
	
	public double manage(double balance, double amount) {
		System.out.println("You have deducted " + amount + " points. Don't beat yourself up too much..");
		return balance-amount;
	}

}
