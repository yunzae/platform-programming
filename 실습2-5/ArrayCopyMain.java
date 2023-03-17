import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {
        //입력으로부터 배열을 생성하시오
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] original = new int[num];

        for(int i=0; i<num; i++) {
            original[i] = sc.nextInt();
        }

        //shallow copy 수행 코드를 작성하시오
        int[] shallow = original;
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(original));


        //deep copy 수행 코드를 작성하시오
        int[] deep =new int[original.length];
        System.arraycopy(original,0,deep,0,original.length);
        modifyArray(deep, 2);
        System.out.println("Deep Copy: " + Arrays.toString(original));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}