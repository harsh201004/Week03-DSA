package linearsearch.searchword;

import java.util.Scanner;
public class WordSearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the sentence: ");
        int numberOfTotalSentences = sc.nextInt();
        sc.nextLine();

        String[] arrayOfString = new String[numberOfTotalSentences];
        for (int i = 0; i < numberOfTotalSentences; i++) {
            System.out.println("Enter the sentence:" + i);
            arrayOfString[i] = sc.nextLine();
        }

        System.out.println("Enter the targeted word: ");
        String target = sc.nextLine();

        System.out.println("Sentence that contains the targeted word: " + WordSearch.wordSearch(arrayOfString, target));
    }
}
