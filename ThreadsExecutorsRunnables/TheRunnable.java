package ThreadsExecutorsRunnables;


import static java.lang.Thread.*;

public class TheRunnable implements Runnable{
    private int taskNum;
    private int delay;
    
    public TheRunnable(){
        taskNum = 0;
    }
    
    private TheRunnable(int taskNum){
        this.taskNum = taskNum;
        delay = 0;
    }
    
    TheRunnable(int taskNum, int delay){
    	this(taskNum);
    	this.delay = delay;
    }
       
    public void run(){
    	System.out.println("Starting new task "+taskNum+" now.");
    	try {
			sleep((delay*1000));
		} catch (InterruptedException e) {}
        System.out.println("The task "+taskNum+" finished after "+delay+" seconds.");
    }
    
}
