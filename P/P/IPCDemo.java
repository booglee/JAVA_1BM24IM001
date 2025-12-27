package P;

import java.io.*;

class Sender extends Thread {
    private PipedOutputStream pos;
    Sender(PipedOutputStream pos) { this.pos = pos; }
    public void run() {
        try {
            pos.write("Hello from Sender".getBytes());
            pos.close();
        } catch (IOException e) {}
    }
}

class Receiver extends Thread {
    private PipedInputStream pis;
    Receiver(PipedInputStream pis) { this.pis = pis; }
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char)data);
            }
            pis.close();
        } catch (IOException e) {}
    }
}

public class IPCDemo {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        new Sender(pos).start();
        new Receiver(pis).start();
    }
}