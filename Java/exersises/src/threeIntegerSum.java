import java.util.Scanner;

import static java.lang.Integer.*;


public class threeIntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = parseInt(scanner.next());
        int num2 = parseInt(scanner.next());
        int num3 = parseInt(scanner.next());

        if(!checkTreeIntegers(num1, num2, num3)
                && !checkTreeIntegers(num3, num2, num1)
                && !checkTreeIntegers(num1, num3, num2)) {
            System.out.println("No");
        }
    }

    static boolean checkTreeIntegers(int num1, int num2, int num3) {
        if(num1 + num2 != num3) {
            return false;
        }

        if(num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, num3);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, num3);
        }
        return true;
    }
}
