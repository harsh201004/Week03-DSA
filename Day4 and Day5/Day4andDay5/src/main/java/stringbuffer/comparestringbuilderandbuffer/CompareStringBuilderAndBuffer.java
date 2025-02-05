package stringbuffer.comparestringbuilderandbuffer;

public class CompareStringBuilderAndBuffer {
    public static long measurePerformance(Object obj, String text, long iterations) {
        long startTime = System.nanoTime();

        if (obj instanceof StringBuffer) {
            StringBuffer sb = (StringBuffer) obj;
            for (int i = 0; i < iterations; i++) {
                sb.append(text);
            }
        } else if (obj instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj;
            for (int i = 0; i < iterations; i++) {
                sb.append(text);
            }
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
