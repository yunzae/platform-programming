
public class Rectangle {
    int x_1;
    int y_1;
    int x_2;
    int y_2;
    public Rectangle(Point p1, Point p2) {
        x_1 = p1.getX();
        y_1 = p1.getY();
        x_2 = p2.getX();
        y_2 = p2.getY();

    }

    public void moveBy(int x, int y) {
        this.x_1+=x;
        this.y_1+=y;
        this.x_2+=x;
        this.y_2+=y;
    }

    public void moveBy(int position) {
        this.x_1+=position;
        this.x_2+=position;
        this.y_1+=position;
        this.y_2+=position;
    }

    @Override
    public String toString() {
        System.out.println("Rectangle[("+this.x_1+","+this.y_1+"),("+this.x_2+","+this.y_2+")]");
        return "";
    }

}
