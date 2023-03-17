import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Number1 : "+num1+",Number2 : "+num2);
        if (num1 > num2){
            System.out.println("Number1>Number2 ? true");
            System.out.println("Number1>Number2 ? false");
        }
        else if (num2 > num1){
            System.out.println("Number1>Number2 ? false");
            System.out.println("Number1>Number2 ? true");
        }
        else {
            System.out.println("Number1>Number2 ? false");
            System.out.println("Number1>Number2 ? false");
        }

        if (num1==num2){
            System.out.println("Number1==Number2 ? true");
        }
        else {
            System.out.println("Number1>Number2 ? false");
        }

    }
}
