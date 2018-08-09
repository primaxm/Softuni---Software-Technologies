import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int lenght = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i-1] < input[i]) {
                lenght++;
                if (lenght > bestLen) {
                    bestLen = lenght;
                    bestStart=start;
                }
            } else {
                start = i;
                lenght = 1;
            }

        }

        for (int i = bestStart; i < bestStart+bestLen; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
