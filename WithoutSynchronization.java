package sync;
class Hello {
        // Synchronized method to ensure only one thread accesses it at a time
        synchronized void hai(String name) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hai " + name);
                try {
                    Thread.sleep(100); // Added delay to better observe thread behavior
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    class MyThread extends Thread {
        Hello h;
        String name;
    
        // Constructor with proper parameter types and assignment
        MyThread(Hello h, String name) {
            this.h = h;
            this.name = name;
        }
    
        // Run method that calls synchronized hai method
        public void run() {
            h.hai(name);
        }
    }
    
    public class WithoutSynchronization {
        public static void main(String[] args) {
            Hello h = new Hello();
    
            // Creating two threads that share the same Hello object
            MyThread t1 = new MyThread(h, "Ramesh");
            MyThread t2 = new MyThread(h, "Mahesh");
    
            // Starting both threads
            t1.start();
            t2.start();
        }
    }
    

