package stringbuilder.removeduplicatefromthestring;

import java.util.*;
public class RemoveDuplicateMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        String output = RemoveDuplicate.removeDuplicates(str);

        // Output the result
        System.out.println("Original string: " + str);
        System.out.println("String without duplicates: " + output);
    }
}
