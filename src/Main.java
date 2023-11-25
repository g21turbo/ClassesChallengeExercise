public class Main {
    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        account.setCustomerName("John Smith");
        account.setPhoneNumber("555-123-6789");
        account.setEmail("John.Smith@gmail.com");
        account.setAccountNumber("123456789");
        account.setAccountBalance(500.00);

        account.withdrawalFunds(50.00);


        account.withdrawalFunds(500.00);


        account.depositFunds(10000.00);

        account.withdrawalFunds(10450.00);



    }



}