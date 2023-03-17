import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

public class DNSClient {
    public static InetAddress ia;
    public static Optional<String> ip=Optional.empty();
    public static Optional<String> query(String urlString) {
        try {
            ia = InetAddress.getByName(urlString);
            ip = Optional.of(ia.getHostAddress());
        }catch (UnknownHostException e) {
            System.out.println(urlString + "   :Name or service not known.");
        }
        return ip;
    }


}
