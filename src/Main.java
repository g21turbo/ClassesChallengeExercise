public class Main {
    public static void main(String[] args) {


//        BankAccount account = new BankAccount("123456789", 500.00, "John Smith", "John.Smith@gmail.com", "555-123-6789");
//        account.setCustomerName("John Smith");
//        account.setPhoneNumber("555-123-6789");
//        account.setEmail("John.Smith@gmail.com");
//        account.setAccountNumber("123456789");
//        account.setAccountBalance(500.00);

        BankAccount bobsAccount = new BankAccount();
        BankAccount timsAccount = new BankAccount("Tim Smith", "Tim.Smith@gmail.com", "555-678-9129");

        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        System.out.println("Customer: " + timsAccount.getCustomerName() + "; Account Number: " + timsAccount.getAccountNumber() + "; Initial Balance: $" + timsAccount.getAccountBalance());
        System.out.println(timsAccount.getAccountBalance());
        System.out.println(timsAccount.getAccountNumber());


        bobsAccount.withdrawalFunds(50.00);
        bobsAccount.withdrawalFunds(500.00);
        bobsAccount.depositFunds(10000.00);
        bobsAccount.withdrawalFunds(10450.00);

    }
}