import java.util.Scanner;

public class ChangetoUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int firstIndex = text.indexOf("<upcase>");
        int secondIndex = text.indexOf("</upcase>");
        String newText = "";
        while (firstIndex != -1) {

            String toUpText = text.substring(firstIndex + 8, secondIndex);
            String upText = toUpText.toUpperCase();

                String replace = "<upcase>" + toUpText + "</upcase>";
            text = text.replace(replace, upText);
            firstIndex = text.indexOf("<upcase>");
            secondIndex = text.indexOf("</upcase>");

        }

        System.out.println(text);
    }
}
