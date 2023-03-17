import java.util.ArrayList;
import java.util.Scanner;

public class BinaryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Number "+num+" in Binary Number: ");
        while (num > 0) {
            int temp = num % 2;
            num /= 2;
            result.add(0, temp);
        }
        for (int i = 0; i < result.size();i++ ){
            System.out.print(result.get(i));
        }
    }
}

