import java.util.Arrays;
import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=1;
        System.out.print("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[][] matrix = new int[num1][num2];
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                matrix[i][j] = num;
                num++;
            }
        }
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                System.out.print(matrix[i][j]);
                if( j!=num2-1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }


    }
}
