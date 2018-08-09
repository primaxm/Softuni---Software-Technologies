import java.util.Scanner;

public class IntegertoHexandBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(Integer.toString(num,16).toUpperCase());
        System.out.println(Integer.toString(num,2));
    }
}
