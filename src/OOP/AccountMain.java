package OOP;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.desposit(10000);
        account1.withdraw(9000);
        account1.withdraw(2000);
        System.out.println(account1.balance);

    }
}
