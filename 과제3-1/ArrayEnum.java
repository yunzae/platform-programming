import java.util.Arrays;
import java.util.Scanner;



public class ArrayEnum {
    enum Command {QUIT,ADD,LIST,SUM,INVALID,MAX,MIN}
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int index=0;
        int[] values;
        values = new int[100];

        while (true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case SUM:
                    System.out.println(getSum(values,index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                case MAX:
                    System.out.println(Arrays.stream(values).max().getAsInt());
                    break;
                case MIN:
                    int min=1000000;
                    for(int i=0;i<values.length;i++){
                        if (values[i] == 0){
                            continue;
                        }
                        if(min > values[i]){
                                min=values[i];
                        }
                    }
                    System.out.println(min);
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    public static Command getCommand(Scanner scanner){
        String myinput = scanner.next();
        myinput = myinput.toUpperCase();
        if(myinput.equals("ADD"))
            return Command.ADD;
        else if(myinput.equals("LIST"))
            return Command.LIST;
        else if(myinput.equals("SUM"))
            return Command.SUM;
        else if(myinput.equals("QUIT"))
            return Command.QUIT;
        else if(myinput.equals("MIN"))
            return Command.MIN;
        else if(myinput.equals("MAX"))
            return Command.MAX;
        else
            return Command.INVALID;
    }
    public static int getValue(Scanner str_in){
        int n = str_in.nextInt();
        return n;
    }

    public static int getSum(int[] values, int index){
        int sum=0;
        for(int i =0;i<index;i++){
            sum+=values[i];
        }
        return sum;
    }
    public static void printList(int[] values, int index){
        for(int i=0; i<index; i++){
            System.out.printf("%d ",values[i]);
        }
        System.out.println();
    }
}
