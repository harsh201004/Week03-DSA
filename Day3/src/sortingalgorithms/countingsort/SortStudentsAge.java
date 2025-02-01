package sortingalgorithms.countingsort;
import java.util.*;

public class SortStudentsAge {
    private int[] ages;

    public SortStudentsAge(int[] ages) {
        this.ages = ages;
    }

    public void sortAges() {
        CountingSort.sort(ages);
    }

    public void displayAges() {
        System.out.println("Sorted Student Ages: " + Arrays.toString(ages));
    }
}
