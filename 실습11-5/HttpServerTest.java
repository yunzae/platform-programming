import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;

public class HttpServerTest {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);
        server.createContext("/hello", new MyHelloHandler());
        server.setExecutor(null);
        server.start();


    }
}

class MyHelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String responseBody = "hello world\n";
        exchange.getResponseHeaders().add("Content-Type", "text/html; UTF-8");
        exchange.sendResponseHeaders(
                HttpURLConnection.HTTP_OK, responseBody.getBytes("UTF-8").length
        );
        OutputStream output = exchange.getResponseBody();
        output.write(responseBody.getBytes("UTF-8"));
        output.flush(); exchange.close();
    }
}