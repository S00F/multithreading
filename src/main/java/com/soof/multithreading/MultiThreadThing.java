package main.java.com.soof.multithreading;

public class MultiThreadThing extends Thread {
    @Override
    public void run() {

        for (int i=0; i <= 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
