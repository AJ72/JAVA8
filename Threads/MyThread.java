package Threads;

// by implementing runnable class
class MyThread implements Runnable {

    @Override
    public void run() {

        // task for thread
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i is  " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            ;
        }
    }

    public static void main(String args[]) {

        // create object of mythread class
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();

        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();
    }

}