import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, String> phonebook = new HashMap<String, String>();
        while (!input.equals("END")) {
            String[] splited = input.split(" ");
            String command = splited[0];
            String name = splited[1];

            switch (command) {
                case "A":
                        String number = splited[2];
                        phonebook.put(name, number);

                    break;
                case "S":
                    if (phonebook.containsKey(name)) {
                        System.out.printf("%s -> %s%n", name, phonebook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.%n", name);
                    }
                    break;
                    default:
                        break;
            }

            input = scanner.nextLine();
        }
    }
}
