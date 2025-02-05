package challengeproblems.comparestringbuilderandbufferandfilereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CompareStringBufferAndBilderAndFilereader {
    public static void compareStringConcatenation() {
        String text = "hello";
        int iterations = 1000000;

        // StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }

    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try  {
            FileReader fr = new FileReader("sample");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String res [] = line.split("\\s");
                for(String s : res){
                    wordCount++;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try  {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                String res [] = line.split("\\s");
                for(String s : res) {
                    wordCount++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public static void compareFileReading(String filePath) {
        long startTime, endTime;

        // FileReader
        startTime = System.nanoTime();
        int wordCount1 = countWordsUsingFileReader(filePath);
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount1 + " | Time: " + (endTime - startTime) + " ms");

        // InputStreamReader
        startTime = System.nanoTime();
        int wordCount2 = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount2 + " | Time: " + (endTime - startTime) + " ms");
    }


}