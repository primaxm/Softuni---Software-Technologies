import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<String, String> phonebook = new TreeMap<String, String>();
        while (!input.equals("END")) {
            String[] splited = input.split(" ");
            String command = splited[0];

                String name = "";


            switch (command) {
                case "A":
                    name = splited[1];
                    String number = splited[2];
                    phonebook.put(name, number);

                    break;
                case "S":
                    name = splited[1];
                    if (phonebook.containsKey(name)) {
                        System.out.printf("%s -> %s%n", name, phonebook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.%n", name);
                    }
                    break;
                case "ListAll":

                    for (String key : phonebook.keySet()) {

                        System.out.println(key + " -> " + phonebook.get(key));

                    }


                default:
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
