import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<String> list = new ArrayList<String>
                (Arrays.asList(scanner.nextLine().split("\\s+")));
        list.stream().mapToInt(Integer::parseInt);

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int number = command[0];
        int power = command[1];

        while (list.contains(number)) {
            int index = list.indexOf(number);
            int startIndex = 0;
            int endIndex = list.size();
            if (index - power >= startIndex) {
                startIndex = index - power;
            }

            if (index + power <= endIndex) {
                endIndex = index + power;
            }
            list.subList(startIndex, endIndex).clear();
            System.out.println(startIndex + " -> " + endIndex);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.indexOf(i);
        }
        System.out.println(sum);
    }
}
