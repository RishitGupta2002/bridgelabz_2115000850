import java.io.*;

public class PipedStreamCommunication {
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis;

        try {
            pis = new PipedInputStream(pos);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }

        Thread writerThread = new Thread(() -> {
            try {
                pos.write("Hello from writer thread!".getBytes());
                pos.close();
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        });

        Thread readerThread = new Thread(() -> {
            try {
                int byteData;
                while ((byteData = pis.read()) != -1) {
                    System.out.print((char) byteData);
                }
                pis.close();
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        });

        writerThread.start();
        readerThread.start();
        
    }
}
