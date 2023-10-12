package OOP.Module0_Basic.Ex5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%-15s | %-30s | %15s | %-15s | %-15s | %-20s", "Goods code", "Goods name", "Price", "MFG", "EXP", "Note");
        System.out.println("\n=============================================================================================================");

        try {
            FoodGoods goods1 = new FoodGoods("1", "Rice", 100000, LocalDate.of(2023, 10, 11), LocalDate.of(2023, 10, 11));
            FoodGoods goods2 = new FoodGoods("2", "Noodles", 5000, LocalDate.of(2023, 5, 22), LocalDate.of(2024, 11, 22));
            FoodGoods goods3 = new FoodGoods("3", "Nuoc", -10000, LocalDate.of(2010, 3, 1), LocalDate.of(2023, 3, 8));

            System.out.println(goods1);
            System.out.println(goods2);
            System.out.println(goods3);

            FoodGoods goods4 = new FoodGoods("", "", -10000, LocalDate.of(2017, 3, 1), LocalDate.of(2020, 3, 8));
            System.out.println(goods4);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
