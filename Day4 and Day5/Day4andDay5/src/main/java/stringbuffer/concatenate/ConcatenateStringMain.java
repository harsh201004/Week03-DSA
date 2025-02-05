package stringbuffer.concatenate;

import java.util.*;
public class ConcatenateStringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int num = sc.nextInt();

        String[] strArray = new String[num];

        for(int i = 0; i < num; i++) {
            System.out.println("Enter string: " + (i+1));
             strArray[i] = sc.next();
        }
        System.out.println("Concatenated string: " + ConcatenateStrings.concatenateStrings(strArray));
    }
}
