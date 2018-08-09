import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SumNIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = parseInt(scanner.next());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = parseInt(scanner.next());
            sum += num;
        }

        System.out.println(sum);
    }
}
