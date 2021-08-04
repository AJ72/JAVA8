package Threads.Producer.Consumer;

public class Consumer extends Thread {

    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            try {
                this.c.consume_item();
            } catch (Exception e1) {

                System.out.println(e1);

            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
