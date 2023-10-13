package OOP.Module0_Basic.Ex5;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodGoods {
    private String goodsCode, goodsName;
    private LocalDate manufacturingDate, expiredDate;
    private int price;

    public FoodGoods() {
        goodsCode = "null";
        goodsName = "xxx";
        manufacturingDate = LocalDate.now();
        expiredDate = manufacturingDate;
        price = 0;
    }

    public FoodGoods(@NotNull String goodsCode, String goodsName, int price, LocalDate manufacturingDate, LocalDate expiredDate) throws Exception {
        if (!goodsCode.trim().isEmpty()) {
            this.goodsCode = goodsCode;
        } else {
            throw new Exception("Error: Empty goods code!!!");
        }

        if (!goodsName.trim().isEmpty()) {
            this.goodsName = goodsName;
        } else {
            this.goodsName = "xxx";
        }

      /*  if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }*/
//        The code above is the same as the code below!!!
        this.price = Math.max(price, 0);
//        IntelliJ suggested this, so I'll try this for the first time!!!

        if (manufacturingDate.isBefore(LocalDate.now())) {
            this.manufacturingDate = LocalDate.now();
        } else {
            this.manufacturingDate = manufacturingDate;
        }

        if (expiredDate.isBefore(manufacturingDate)) {
            this.expiredDate = this.manufacturingDate;
        } else {
            this.expiredDate = expiredDate;
        }
    }

    public FoodGoods(String goodsCode) throws Exception {
        if (!goodsCode.trim().isEmpty()) {
            throw new Exception("Error: Empty goods code!!!");
        } else {
            this.goodsCode = goodsCode;
            this.goodsName = "xxx";
            this.price = 0;
            this.manufacturingDate = LocalDate.now();
            this.expiredDate = this.manufacturingDate;
        }
    }

    public boolean isExpired() {
        /*if (expiredDate.isAfter(LocalDate.now())) {
            return false;
        } else {
            return true;
        }*/
        return !expiredDate.isAfter(LocalDate.now());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String note = "";
        if (isExpired()) {
            return "Expired!!!";
        }
        String strPrice = df.format(price);

        return String.format("%-15s | %-30s | %15s | %15s | %15s | %-20s", goodsCode, goodsName, strPrice, manufacturingDate.format(dtf), expiredDate.format(dtf), note);
    }
}
