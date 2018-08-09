import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] firstCircle = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(s -> Double.parseDouble(s))
                .toArray();
        double[] secondCircle = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(s -> Double.parseDouble(s))
                .toArray();

        double distance = Math.sqrt(Math.pow(firstCircle[0] - secondCircle[0], 2)
                + Math.pow(firstCircle[1] - secondCircle[1], 2));


        double sum = Math.abs(firstCircle[2] - secondCircle[2]);
        if (distance > sum) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
