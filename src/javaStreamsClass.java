import javax.sound.midi.SysexMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class javaStreamsClass {
         public static void main(String[] args) {

         byte[] array = new byte[100];
             try {
         InputStream input = new FileInputStream("input.txt");
         System.out.println("Available bytes in the file: " + input.available());
         // Read byte from the input stream
         input.read(array);
          System.out.println("Data read from the file: ");
         // Convert byte array into string
         String data = new String(array);
         System.out.println(data);
         // Close the input stream
                 System.out.println("something you must to print: "+32);
         input.close();
         }
             catch (Exception e) {
         e.getStackTrace();
        }
   }
}