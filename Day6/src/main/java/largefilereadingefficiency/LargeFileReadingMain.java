package largefilereadingefficiency;

public class LargeFileReadingMain {
    public static void main(String[] args) {
        String[] files = {"largefile.pdf", "largefile2.pdf", "largefile3.pdf"};
        for (String file : files) {
            LargeFileReading.compare(file);
        }

    }
}
