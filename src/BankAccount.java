public class BankAccount {

    String accountNumber;
    double accountBalance;
    String customerName;
    String email;
    String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        setAccountBalance(getAccountBalance() + amount);
    }

    public void withdrawalFunds(double amount) {
        if (getAccountBalance() - amount < 0) {
            System.out.println("Invalid Transaction");
        } else {
            setAccountBalance(getAccountBalance() - amount);
        }
    }


}
