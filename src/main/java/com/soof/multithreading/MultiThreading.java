package main.java.com.soof.multithreading;

public class MultiThreading {

    public static void main(String[] args) {


        MultiThreadThing multiThreadThing1 = new MultiThreadThing();
        MultiThreadThing multiThreadThing2 = new MultiThreadThing();


        multiThreadThing1.start();
        multiThreadThing2.start();

    }
}
