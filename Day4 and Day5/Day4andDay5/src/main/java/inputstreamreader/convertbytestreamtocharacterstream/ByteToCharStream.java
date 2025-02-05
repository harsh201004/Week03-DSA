package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.*;
public class ByteToCharStream {
    public static void convertByteStreamToChar(String filePath, String charset) {
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, charset);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
