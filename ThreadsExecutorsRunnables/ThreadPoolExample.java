package ThreadsExecutorsRunnables;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) throws InterruptedException {

		Executor myExecutor = Executors.newFixedThreadPool(2);
    	//task 1
    	myExecutor.execute(new TheRunnable(1,5));
    	
    	//task 2
    	myExecutor.execute(new TheRunnable(2,4));
    	
    	//task 3
    	myExecutor.execute(new TheRunnable(3,3));

		//task 4
		myExecutor.execute(new TheRunnable(4,3));

		//task 5
		myExecutor.execute(new TheRunnable(5,8));

		//task 6
		myExecutor.execute(new TheRunnable(6,2));

		//task 7
		myExecutor.execute(new TheRunnable(7,3));

		//task 8
		myExecutor.execute(new TheRunnable(8,6));

		//task 9
		myExecutor.execute(new TheRunnable(9,1));
    	
    	System.out.println("Program can continue while waiting for the longer task.");
    	
    }
}
