import java.util.Scanner;

public class BooleanVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean var = Boolean.parseBoolean(scanner.nextLine());

        if (var) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
