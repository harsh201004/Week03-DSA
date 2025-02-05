package linearsearch.firstnegativenumber;

public class FirstNegative {
    public static int firstNegative(int[] element) {
        for(int i = 0; i < element.length; i++) {
            if (element[i] < 0) {
                return i;
                }
            }
        return -1;
        }
}