package thread;

import java.util.Random;

class OddThread extends Thread {
    private int num;

    public OddThread(int num) {
        this.num = num;
        start(); // Start the thread in the constructor
    }

    public void run() {
        System.out.println("Cube of " + num + " is " + (num * num * num));
    }   
}

class EvenThread extends Thread {
    private int num;

    public EvenThread(int num) {
        this.num = num;
        start(); // Start the thread in the constructor
    }

    public void run() {
        System.out.println("Square of " + num + " is " + (num * num));
    }
}

class RandomThread extends Thread {
    public void run() {
        try {
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(100); // Generate a random integer between 0 and 99
                System.out.println("Generated Number: " + num);
                Thread.sleep(1000); // Sleep for 1 second

                // Create and start either an OddThread or EvenThread based on the number
                if (num % 2 != 0) {
                    new OddThread(num);
                } else {
                    new EvenThread(num);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Start the RandomThread
        RandomThread randomThread = new RandomThread();
        randomThread.start();
    }
}
