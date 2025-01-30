package stackandqueue.circulartour;
public class CircularTour{
public int startingPoint(PetrolPump[] pumps) {
    int totalSurplus = 0, surplus = 0, start = 0;

    System.out.println("Step-by-step calculation:");
    for (int i = 0; i < pumps.length; i++) {
        int petrolGain = pumps[i].petrol - pumps[i].distance;
        surplus += petrolGain;
        totalSurplus += petrolGain;

        System.out.println("Pump " + i + ": Petrol = " + pumps[i].petrol + ", Distance = " + pumps[i].distance + ", Surplus = " + surplus);

        if (surplus < 0) {
            System.out.println("Reset at pump " + (i + 1));
            start = i + 1;
            surplus = 0;
        }
    }

    if (totalSurplus < 0) {
        System.out.println("No solution exists");
        return -1;
    }

    System.out.println("Total Surplus: " + totalSurplus);
    return start;
   }
}
