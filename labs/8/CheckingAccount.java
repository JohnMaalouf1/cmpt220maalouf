package lab8;

public class CheckingAccount extends Account{

    private double overdraftLimit;
    // Empty constructor calls super and sets overdraftLimit to -100
    public CheckingAccount() {
        super();
        overdraftLimit = -100;
    }
    // Overloaded contructor
    public CheckingAccount(int idCheck, double balanceCheck, double overdraftLimitCheck) {
        super(idCheck, balanceCheck);
        this.overdraftLimit = overdraftLimitCheck;
    }

    //Setter
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    //Getter
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    // Withdraw money
    public void withdrawMoney(double amount) {
        if (!(getBalance() - amount > overdraftLimit)) {
            System.out.println("you have exceeded the overdraft limit!");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public String toString() {
        return super.toString() + "\nOverdraftLimit" + overdraftLimit;
    }
}



