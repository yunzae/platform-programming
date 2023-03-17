import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for ( int i=1;i<=num;i++){
            System.out.println("Factorial of "+ i +" = " +getFactorial(i));
        }
    }
    public static long getFactorial(final int n){
        if(n<=1)
            return n;
        else
            return getFactorial(n-1)*n;
    }
}
