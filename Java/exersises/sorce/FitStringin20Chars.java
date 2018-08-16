import java.util.Scanner;

public class FitStringin20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] str = input.split("");

        for (int i = 0; i < 20; i++) {
            if (str.length >= 20) {
                System.out.print(str[i]);
            } else if (str.length < 20) {
                if(i > str.length-1) {
                    System.out.print("*");
                } else {
                    System.out.print(str[i]);
                }
            }
        }

    }
}
