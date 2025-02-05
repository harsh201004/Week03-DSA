package stringbuffer.comparestringbuilderandbuffer;

public class CompareStringBufferAndBuilderMain {
    public static void main(String[] args) {
        long iterations = 100000;
        String text = "hello";

        // Measure execution time for StringBuffer
        long timeBuffer = CompareStringBuilderAndBuffer.measurePerformance(new StringBuffer(), text, iterations);
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " nanoseconds");

        // Measure execution time for StringBuilder
        long timeBuilder = CompareStringBuilderAndBuffer.measurePerformance(new StringBuilder(), text, iterations);
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " nanoseconds");
    }
}
