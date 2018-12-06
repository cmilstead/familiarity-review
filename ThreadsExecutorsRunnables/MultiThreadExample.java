package ThreadsExecutorsRunnables;

public class MultiThreadExample {

    public static void main(String[] args) throws InterruptedException {

    	//task 1
    	Thread thread1 = new Thread(new TheRunnable(1,3));
    	thread1.start();
    	
    	//task 2
    	Thread thread2 = new Thread(new TheRunnable(2,2));
    	thread2.start();

        //task 3
        Thread thread3 = new Thread(new TheRunnable(3,2));
        thread3.start();

        //task 4
        Thread thread4 = new Thread(new TheRunnable(4,4));
        thread4.start();

        //task 5
        Thread thread5 = new Thread(new TheRunnable(5,4));
        thread5.start();

        //task 6
        Thread thread6 = new Thread(new TheRunnable(6,9));
        thread6.start();

        //task 7
        Thread thread7 = new Thread(new TheRunnable(7,2));
        thread7.start();

        //task 8
        Thread thread8 = new Thread(new TheRunnable(8,6));
        thread8.start();

    	System.out.println("Program can continue while waiting for the longer task.");

    }


}

