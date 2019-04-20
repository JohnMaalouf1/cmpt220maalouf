package lab8;

public class SavingsAccount extends Account {
    // Defalut Constructor
    public SavingsAccount() {
        //Calling super class that this class inherits from
        super();
    }

    // Overloaded Constructor with id and balance
    public SavingsAccount(int idWithdra, double balanceWithdraw) {
        // Calling super class that this class inherits from
        super(idWithdra, balanceWithdraw);
    }

    public void withdrawMoney(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("You overdrew from the savings account!");
    }
}
