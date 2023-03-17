import java.util.ArrayList;
import java.util.Scanner;

public class AreaCalculator {
    public static Scanner sc = new Scanner(System.in);

    enum Shape {TRIANGLE, RECTANGLE, CIRCLE}

    public static final int TRIANGLE = 1;
    public static final int RECTANGLE = 2;
    public static final int CIRCLE = 3;


    public static void main(String[] args) {
        boolean run=true;
        double area;

        while(run){
            String shape = sc.next();
            switch (shape. toUpperCase()){
                case "TRIANGLE":
                    double base = sc.nextDouble();
                    double height2 = sc.nextDouble();
                    area = base * height2/2;
                    System.out.printf("Area of Triangle: %.2f\n" ,area);
                    break;
                case "CIRCLE":
                    double radius = sc.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.printf("Area of Circle: %.2f\n",area);
                    break;
                case "RECTANGLE":
                    double width = sc.nextDouble();
                    double height1 = sc.nextDouble();
                    area = width * height1;
                    System.out.printf("Area of Rectangle: %.2f\n" ,area);
                    break;
                case "QUIT":
                    System.out.println("BYE");
                    run = false;
                    sc.close();
                    break;
                default:
                    System.out.println("INVALID");
                    break;

            }
        }
    }

}
