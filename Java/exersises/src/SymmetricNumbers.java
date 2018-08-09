import java.lang.reflect.Array;
import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= num; i++) {
            int[]digits = Integer.toString(i).chars().map(c -> c-'0').toArray();
            boolean isSym = true;
            for (int a = 0; a < digits.length/2; a++) {
                if (digits[a] != digits[digits.length - 1 - a]) {
                    isSym = false;
                }

            }

            if (isSym) {
                System.out.println(i);
            }
        }

    }

}
