import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerClient {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String URL = makeURL(scanner);
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .timeout(Duration.ofMinutes(1))
                .header("Content-Type", "application/json")
                .GET()
                .build();
        ObjectMapper obm = new ObjectMapper();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            CollectionType playerListType = obm.getTypeFactory().constructCollectionType(List.class, Player.class);
            List<Player> players = new ArrayList<>();
            players = obm.readValue(response.body(), playerListType);
            if (response.statusCode() == 200) {
                System.out.println(players);
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static String makeURL(Scanner scanner) {
        String baseURL = "http://localhost:9000/players?";
        String search[] = scanner.nextLine().split(" ");
        for (int i = 0; i < search.length - 1; i += 2) {
            baseURL += (search[i] + "=" + search[i+1]);
            if (i + 2 < search.length) baseURL += "&";
        }
        return baseURL;
    }
}