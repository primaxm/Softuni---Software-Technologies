import java.util.Scanner;

public class sumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double sum = a + b;
        System.out.printf("Sum = %.2f", sum);
    }
}
