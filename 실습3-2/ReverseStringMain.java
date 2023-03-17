import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.nextLine();
        for(int i=origin.length()-1; i>=0; i--){
            System.out.print(origin.charAt(i));
        }

    }
}
