public class Rectangle implements MyComparable {
    private int x, y, area;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        this.area = x*y;
    }

    public int compareTo(Object other) {
        if (!(other instanceof Rectangle)) return -2;
        Rectangle otherRec = (Rectangle) other;
        int returnValue = 0;
        if (this.area < otherRec.area) returnValue = -1;
        if (this.area == otherRec.area) returnValue = 0;
        if (this.area > otherRec.area) returnValue = 1;
        return returnValue;
    }

    public boolean equal(Object other) {
        if (!(other instanceof Circle)) return false;
        Rectangle otherRec = (Rectangle) other;
        return x == otherRec.x && y == otherRec.y && area == otherRec.area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }
}
