import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        int bigCount = 0;
        int value = input[0];
        for (int i = 0; i < input.length-1; i++) {
            for (int s = i+1; s < input.length; s++) {
                if (input[i] == input[s]) {
                    count++;
                }
                if (count > bigCount) {
                    bigCount = count;
                    value = input[i];
                }
            }
            count = 0;
        }

        System.out.println(value);
    }
}
