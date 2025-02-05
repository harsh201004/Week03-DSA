package filereader.occuranceofwordinfile;

import java.util.*;
import java.io.*;
public class CountWordMain {
    public static void main(String[] args) {
        String filePath = "sample";
        String targetWord = "Java";

        int wordCount = CountWord.countWordOccurrences(filePath, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
    }

}

