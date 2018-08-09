import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] str = input.split("");


        for (int i = str.length-1; i >= 0; i--) {
            System.out.print(str[i]);
        }

    }
}
