import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> data = new ArrayList<>();

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        sc.close();



        List<String> upperStrData = data.stream().map(s->s.toUpperCase()).toList();

        System.out.println(upperStrData);

    }

}