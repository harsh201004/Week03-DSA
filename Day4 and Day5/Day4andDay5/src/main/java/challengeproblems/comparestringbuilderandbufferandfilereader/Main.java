package challengeproblems.comparestringbuilderandbufferandfilereader;

public class Main {
    public static void main(String[] args) {
       CompareStringBufferAndBilderAndFilereader.compareStringConcatenation();
        int count = CompareStringBufferAndBilderAndFilereader.countWordsUsingFileReader("sample");
        int count1 = CompareStringBufferAndBilderAndFilereader.countWordsUsingInputStreamReader("sample");
        System.out.println(" Word count using file reader " +count);
        System.out.println(" Word count using InputStreamReader" +count1);
        CompareStringBufferAndBilderAndFilereader.compareFileReading("sample");

    }
}
