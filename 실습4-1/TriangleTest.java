import java.util.Scanner;

class Triangle {
    //Your code here (멤버 변수로 밑변과 높이를 정의)
    private final int base;
    private final int height;

    public Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        double area = this.base*this.height/2.0;
        return area;
    }
    public String toString(){
        String msg = "Triangle [base="+this.base+" ,height="+this.height+", area="+String.format("%.2f",getArea())+"]";
        return msg;
    }
    //Your code here (생성자, getArea(), toString() 메서드 정의)
}
public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Triangle[] triangles = new Triangle[N];
        for(int i=0;i< triangles.length;i++){
            int temp_base= sc.nextInt();
            int temp_height= sc.nextInt();
            triangles[i] = new Triangle(temp_base,temp_height);
            System.out.println(triangles[i].toString());
        }

        //Your code here (표준 입력을 받아 N개의 삼각형을 생성하고, 밑변, 높이, 넓이를 출력하시오)
    }
}