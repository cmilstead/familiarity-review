package ApplicationController;

import java.util.HashMap;

public class Controller {
	
	public static HashMap<String, PointManagement> map = new HashMap <String, PointManagement>();
	
	public void Controller() {
		
	}
	
	public double handleRequest(String request, double balance, double amount) {
		
		map.put("DEDUCT", new Deduct());
		map.put("ADD", new Add());
		map.put("BALANCE", new Balance());
		
		PointManagement handler = map.get(request);
		balance = handler.manage(balance, amount);
		
		return balance;
		
	}
	
}
