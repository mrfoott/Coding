package OOP.Module0_Basic.Ex4;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Vo Hong Phu", "Future FI", 125, 33000000);
        Vehicle xe2 = new Vehicle("Le Minh Hoang Nhat", "Vision", 150, 45000000);
        Vehicle xe3 = new Vehicle();

        System.out.printf("%-30s | %-20s | %10s | %10s | %10s", "Bike Owner", "Bike Brand", "Capacity", "Price", "Tax");
        System.out.println("\n============================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
