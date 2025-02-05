package filereader.readafilebyfilereaderlinebyline;

import java.io.*;
public class FilesReader {
    public static void readFile() {
       String filePath = "sample";

       try {
           FileReader fr = new FileReader(filePath);
           BufferedReader br = new BufferedReader(fr);
           String line;

           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
