package Assignment_4;

public class Main {
    public static void main(String[] args) {
        AccountOverdrawDemo acc = new AccountOverdrawDemo();
        Thread First = new Thread(acc);
        Thread Second = new Thread(acc);
        First.setName("Arpit");
        Second.setName("Adi");
        First.start();
        Second.start();
    }
}