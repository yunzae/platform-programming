import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchMain2 {
    public static void main(String[] args) {
        boolean run=true;
        ArrayList<String> month_all = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"));
        ArrayList<String> month_list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(run){
            String command = sc.next();
            switch (command){
                case "add":
                    int month = sc.nextInt();

                    month_list.add(month_all.get(month-1));
                    break;
                case "print":
                    System.out.println(month_list);

                    break;
                case "quit":
                    System.out.println("Bye");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }

    }
}
