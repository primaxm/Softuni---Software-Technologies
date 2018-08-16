import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsbyTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> cities = new TreeMap<String, Double>();
        for (int i = 0; i < n; i++) {
            String input[] = scanner.nextLine().split("\\|");
            String townName = input[0].trim();
            double income = Double.parseDouble(input[1].trim());

            if (cities.containsKey(townName)) {
                double sum = cities.get(townName) + income;
                cities.put(townName, sum);
            } else {
                cities.put(townName, income);
            }

        }

        for (String key: cities.keySet()) {
            System.out.println(key + " -> " + cities.get(key));
        }
    }
}
