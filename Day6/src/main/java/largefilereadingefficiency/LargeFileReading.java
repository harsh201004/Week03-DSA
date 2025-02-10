package largefilereadingefficiency;
import java.io.*;

public class LargeFileReading {
    public static void readUsingFileReader(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1); // Read character by character
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsingInputStreamReader(String filePath) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1); // Read byte by byte and convert to character
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double[] compare(String filePath) {
        double[] output = new double[2];

        //FileReader Performance
        long start = System.nanoTime();
        readUsingFileReader(filePath);
        long fileReaderTime = System.nanoTime() - start;

        //InputStreamReader Performance
        start = System.nanoTime();
        readUsingInputStreamReader(filePath);
        long inputStreamReaderTime = System.nanoTime() - start;

        output[0] = fileReaderTime/1000000.0;
        output[1] = inputStreamReaderTime/1000000.0;

        System.out.println("File Path: " + filePath);
        System.out.println("File Reader Time: " + output[0] + " ms");
        System.out.println("Input Stream Reader: " + output[1] + " ms");
        System.out.println("--------------------------------------------");
        return output;
    }
}
