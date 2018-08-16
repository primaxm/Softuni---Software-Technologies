import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        String protocol = "";
        String server = "";
        String resource = "";
        if (url.contains("://")) {
            String [] splited = url.split("://");
            protocol = splited[0];
            if (splited[1].contains("/")) {
                server = splited[1].substring(0, splited[1].indexOf("/"));
                resource = splited[1].substring(splited[1].indexOf("/") + 1);
            } else {
                server = splited[1];
            }
        } else {
            if (url.contains("/")) {
                server = url.substring(0, url.indexOf("/"));
                resource = url.substring(url.indexOf("/") + 1);
            } else {
                server = url;
            }
        }

        System.out.println("[protocol] = \"" + protocol + "\"");
        System.out.println("[server] = \"" + server + "\"");
        System.out.println("[resource] = \"" + resource + "\"");

    }
}
