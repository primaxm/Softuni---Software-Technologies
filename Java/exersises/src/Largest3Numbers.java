import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(input);

        int count = Math.min(input.length, 3);
        for (int i = 0; i < count; i++) {
            System.out.print(input[input.length - 1 - i] + " ");
        }
    }

}
