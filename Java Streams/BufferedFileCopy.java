import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "largeFile.txt";
        String destinationFile = "largeFileCopy.txt";
        final int BUFFER_SIZE = 4096;

        long startTime, endTime;

       
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            
            startTime = System.nanoTime();
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            endTime = System.nanoTime();
            System.out.println("Unbuffered Streams Time: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            startTime = System.nanoTime();
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            endTime = System.nanoTime();
            System.out.println("Buffered Streams Time: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
