package recursiveanditerativefibonacci;

public class RecursiveVsIterativeFibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static double[] compare(int n) {
        double[] output = new double[2];

        //Recursive Fibonacci Performance
        long start = System.nanoTime();
        fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - start;

        //Iterative Fibonacci Performance
        start = System.nanoTime();
        fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - start;


        output[0] = recursiveTime/1000000.0;
        output[1] = iterativeTime/1000000.0;

        System.out.println("Size: " + n);
        System.out.println("Recursive Performance Time: " + output[0] + " ms");
        System.out.println("Iterative Performance Time: " + output[1] + " ms");
        System.out.println("-------------------------------------");
        return output;

    }

}
