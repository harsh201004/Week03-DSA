package hashmapandhashfunction.customhashmap;
import java.util.*;
public class CustomHashMapMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        while (true) {
            System.out.println("\n1. Put (Insert/Update)");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Print Map");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (Integer): ");
                    int key = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter value (String): ");
                    String value = sc.nextLine();
                    map.put(key, value);
                    System.out.println("Inserted: Key = " + key + ", Value = " + value);
                    break;

                case 2:
                    System.out.print("Enter key to get value: ");
                    key = sc.nextInt();
                    String result = map.get(key);
                    System.out.println(result != null ? "Value: " + result : "Key not found.");
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    System.out.println("Key " + key + " removed.");
                    break;

                case 4:
                    System.out.println("Printing the entire map:");
                    map.printMap();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
