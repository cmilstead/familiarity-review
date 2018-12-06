package ThreadsExecutorsRunnables;

public class ThreadExample extends Thread {


    // Example of using 4 threads

    public void run() {
        for(int i = 0; i < 9; i++) {
            System.out.println("Thread id: " + Thread.currentThread().getName());
            try {
                sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for(int threadCnt = 0; threadCnt < 9; threadCnt++) {
            ThreadExample aThread = new ThreadExample();
            aThread.start();
        }
    }

}