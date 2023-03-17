import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mystr = sc.nextLine();
        printType(mystr);
        System.out.println("Type conversion to int...");
        int myint = Integer.parseInt(mystr);
        printType(myint);
        System.out.println("Type conversion int to float...");
        float myfloat = (float)myint;
        printType(myfloat);
    }
    private static void printType(String x){
        System.out.println(x+" is a string");
    }
    private static void printType(int x){
        System.out.println(x+" is an int");
    }
    private static void printType(float x){
        System.out.println(x+" is a float");
    }

}
