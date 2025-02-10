package comparingdatastructuresforsearching;

public class DataStructuresComparisonMain {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int N : sizes) {
            DataStructuresComparison.compare(N);
        }
    }
}
