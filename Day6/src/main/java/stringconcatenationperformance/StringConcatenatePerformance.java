package stringconcatenationperformance;

public class StringConcatenatePerformance {
    public static void stringConcatenate(int size) {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += "a";
        }
    }

    public static void stringbuilderConcatenate(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }

    public static void stringbufferConcatenate(int size) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }

    public static double[] compare(int size) {

        double[] output = new double[3];

        //String Performance
        long start = System.nanoTime();
        stringConcatenate(size);
        long stringTime =  System.nanoTime() - start;

        //Stringbuilder Performance
        start = System.nanoTime();
        stringbuilderConcatenate(size);
        long stringbuilderTime =  System.nanoTime() - start;

        //Stringbuffer Performance
        start = System.nanoTime();
        stringbufferConcatenate(size);
        long stringbufferTime = System.nanoTime() - start;

        output[0] = stringTime/1000000.0;
        output[1] = stringbuilderTime/1000000.0;
        output[2] = stringbufferTime/1000000.0;

        System.out.println("Size: " + size);
        System.out.println("String Performance Time: " + output[0] + " ms");
        System.out.println("Stringbuilder Performance Time: " + output[1] + " ms");
        System.out.println("Stringbuffer Performance Time: " + output[2] + " ms");
        System.out.println("-------------------------------------");
        return output;

    }
}
