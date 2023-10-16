package OOP.Module0_Basic.Ex6;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Vo Hong Phu", 1000000);
        Account account2 = new Account(2, "Le Minh Hoang Nhat", 2000000);
        Account account3 = new Account(3, "Tran Thanh Tuan", 3000000);

        account1.deposit(500000);
        account2.deposit(100000);
        account2.withdraw(400000, 50000);
        account3.addInterest();
        account1.toString();
        account2.toString();
        account3.toString();
        account2.transfer(account1, 50000);
        account1.toString();
        account2.toString();
    }
}
