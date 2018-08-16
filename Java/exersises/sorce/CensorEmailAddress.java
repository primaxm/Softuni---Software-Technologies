import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputEmail = scanner.nextLine();
        String text = scanner.nextLine();
        String[] str = inputEmail.split("@");

        int index = text.indexOf(str[0]);
        String newText = "";
        String replace = "";
        for (int i = 0; i < str[0].length(); i++) {
            replace += "*";
        }
        replace += "@" + str[1];
        newText = text.replace(inputEmail, replace);

        System.out.println(newText);
    }
}
