package OOP;

public class Experiments {
    public static void main(String[] args) {
        Client ivan = new Client(1,"Ivan", "+35988");
        Account ivan1 = new Account(100,1000,1.5,ivan);

        ivan1.deposit(1000);
        ivan1.deposit(2000);
        ivan1.withdraw(500);

        System.out.println(ivan1.withdraw(5000));
    }
}
