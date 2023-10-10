package OOP.Module0_Basic.Ex3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(0, 0 , 0);
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle(3, 3, 3);
        Triangle triangle4 = new Triangle(2, 2, 3);
        Triangle triangle5 = new Triangle(2, 3, 4);
        System.out.println("Triangle 1:\n" + triangle1.toString());
        System.out.println("==");
        System.out.println("Triangle 2:\n" + triangle2.toString());
        System.out.println("==");
        System.out.println("Triangle 3:\n" + triangle3.toString());
        System.out.println("==");
        System.out.println("Triangle 4:\n" + triangle4.toString());
        System.out.println("==");
        System.out.println("Triangle 5:\n" + triangle5.toString());
    }
}
