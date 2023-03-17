import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str2.toLowerCase()));
        System.out.println(str2.equalsIgnoreCase(str1.replace("easy","fun")));

    }
}
