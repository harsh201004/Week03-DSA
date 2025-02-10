package recursiveanditerativefibonacci;

public class RecursiveVsIterativeFibonacciMain {
    public static void main(String[] args) {
        int[] sizes = {10, 30, 50};

        for (int N : sizes) {
            RecursiveVsIterativeFibonacci.compare(N);
        }
    }
}
