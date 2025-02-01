package sortingalgorithms.countingsort;

public class CountingSort {
    public static void sort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Sort the ages
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            sortedAges[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }
}
