package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.*;
import java.util.*;
public class ByteToCharStreamMain {
     static String filePath = "sample";
     static String charset = "UTF-8";
   public static void main(String[] args) throws IOException {
       ByteToCharStream.convertByteStreamToChar(filePath,charset);
   }
}
