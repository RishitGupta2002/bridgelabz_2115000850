import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageToByteArray {
    public static void main(String[] args) {
        String sourceImage = "img.jpg";
        String destinationImage = "destinationImage.jpg";
        
        try (FileInputStream fis = new FileInputStream(sourceImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                baos.write(byteData);
            }

            byte[] imageData = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 FileOutputStream fos = new FileOutputStream(destinationImage)) {
                
                while ((byteData = bais.read()) != -1) {
                    fos.write(byteData);
                }
            }
            System.out.println("Image conversion successful.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
