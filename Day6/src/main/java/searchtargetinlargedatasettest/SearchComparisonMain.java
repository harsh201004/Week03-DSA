package searchtargetinlargedatasettest;

public class SearchComparisonMain {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int N : sizes) {
            SearchComparison.comparePerformance(N);
        }

    }
}
