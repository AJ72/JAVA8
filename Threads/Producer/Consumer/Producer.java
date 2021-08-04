package Threads.Producer.Consumer;

public class Producer extends Thread {

    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                this.c.produce_item(i);
            } catch (Exception e1) {

                System.out.println(e1);

            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            i++;
        }
    }

}
