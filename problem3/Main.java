package Problem3;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A101", "Sujan", 5000);

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println(account.getBalance());
    }
}