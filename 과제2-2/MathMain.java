import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a begin number:");
        int begin = sc.nextInt();
        System.out.println("Enter an end number:");
        int end = sc.nextInt();

        long sum = getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d :%,d%n",begin,end,sum);

        long product = getProductBetween(begin,end);
        System.out.printf("Product between %d and %d : %,d%n",begin,end,product);
    }
    public static long getSumBetween(int begin,int end){
        long res=0;
        for(int i = begin;i<=end;i++){
            res+=i;
        }
        return res;
    }
    public static long getProductBetween(int begin,int end){
        long res=1;
        for(int i = begin;i<=end;i++){
            res*=i;
        }
        return res;
    }
}
