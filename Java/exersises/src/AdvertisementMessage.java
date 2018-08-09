import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String phrases[] = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String events[] = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String author[] = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String cities[] = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int phraseIndex = rand.nextInt(phrases.length);
            int eventIndex = rand.nextInt(events.length);
            int authorIndex = rand.nextInt(author.length);
            int townIndex = rand.nextInt(cities.length);
            System.out.println(phrases[phraseIndex] + " " + events[eventIndex] + " " + author[authorIndex] + " - " + cities[townIndex]);
        }
    }
}
