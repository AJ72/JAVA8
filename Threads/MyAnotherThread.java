package Threads;

// by extending thread class
public class MyAnotherThread extends Thread {

    public void run() {
        for (int i = 9; i >= 0; i--) {
            System.out.println("Value of j is " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
