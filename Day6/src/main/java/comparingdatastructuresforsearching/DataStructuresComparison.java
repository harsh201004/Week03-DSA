package comparingdatastructuresforsearching;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructuresComparison {
    public static int searchInArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static double[] compare(int size) {
        HashSet<Integer> hset = new HashSet<>();
        TreeSet<Integer> tset = new TreeSet<>();

        int[] dataSet = new int[size];
        double[] output = new double[3];

        for (int i = 0; i < size; i++) {
            dataSet[i] = i;
        }

        int target = size - 1;

        for (int i = 0; i < dataSet.length; i++) {
            hset.add(dataSet[i]);
            tset.add(dataSet[i]);
        }

        //Array Search Performance
        long start = System.nanoTime();
        searchInArray(dataSet, target);
        long arrayTime = System.nanoTime() - start;

        //HashSet Search Performance
        start = System.nanoTime();
        boolean searchInHashSet = hset.contains(target);
        long hashsetTime = System.nanoTime() - start;

        //TreeSet Search Performance
        start = System.nanoTime();
        boolean searchInTreeSet = tset.contains(target);
        long treesetTime = System.nanoTime() - start;

        output[0] = arrayTime/1000000.0;
        output[1] = hashsetTime/1000000.0;
        output[2] = treesetTime/1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("Array Search Time: " + output[0] + " ms");
        System.out.println("HashSet Search Time: " + output[1] + " ms");
        System.out.println("TreeSet Search Time: " + output[2] + " ms");
        System.out.println("---------------------------------");
        return output;
    }
}
