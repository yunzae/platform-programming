import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double res1 = 1.0*num1/num2;
        String res1S = String.format("%.3f",res1);
        System.out.println(num1 + " / " + num2+ " = "+res1S);
        System.out.println(num1+" = "+(int)res1+" x "+num2+" + "+num1%num2);
    }
}
