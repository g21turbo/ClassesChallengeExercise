public class Main {
    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        account.customerName = "John Smith";
        account.phoneNumber = "555-123-6789";
        account.email = "John.Smith@gmail.com";
        account.accountNumber = "123456789";
        account.accountBalance = 500.00;

        account.withdrawalFunds(50.00);

        System.out.println(account.getAccountBalance());

        account.withdrawalFunds(500.00);

        System.out.println(account.getAccountBalance());

        account.depositFunds(10000.00);

        System.out.println(account.getAccountBalance());

    }



}