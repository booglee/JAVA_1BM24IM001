package P;

class Thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {}
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {}
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}