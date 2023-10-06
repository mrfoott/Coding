package OOP.Module0_Basic.Ex1;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5, 8, "A");
        Point point2 = new Point(9, 9, "C");
        Point point3 = new Point(6, 2, "B");
        Point point4 = new Point();

        System.out.println(point1.toString());
        System.out.println(point3.toString());
        System.out.println(point2.toString());
        System.out.println(point4.toString());
    }
}
