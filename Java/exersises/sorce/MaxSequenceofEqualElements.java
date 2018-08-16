import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int value = input[0];
        int mainCount = 1;
        int count = 1;

        for (int i = 1; i < input.length; i++) {

            if (input[i-1] == input[i]) {
                count++;
                if (count > mainCount) {
                    mainCount = count;
                    value = input[i];
                }
            } else {
                count = 1;
            }
        }

        for (int i = 0; i < mainCount; i++) {
            System.out.print(value + " ");
        }


    }
}
