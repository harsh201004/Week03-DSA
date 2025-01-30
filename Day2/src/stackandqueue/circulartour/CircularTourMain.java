package stackandqueue.circulartour;

public class CircularTourMain {
    public static void main(String[] args) {
        CircularTour ct = new CircularTour();
        PetrolPump[] pumps = {
                new PetrolPump(6, 6),
                new PetrolPump(3, 5),
                new PetrolPump(7, 7),
                new PetrolPump(4, 5)
        };

        int start = ct.startingPoint(pumps);
        System.out.println(start == -1 ? "No solution exists" : "Start at petrol pump: " + start);
    }
}
