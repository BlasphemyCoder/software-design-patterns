package ex01A;


public class BankAccountProxy implements BankAccount {
    private BankAccountImpl bank;

    public BankAccountProxy(String bank, double initialDeposit){
        this.bank = new BankAccountImpl(bank, initialDeposit);
    }

    public String getBank() {
        return this.bank.getBank();
    }

    @Override public void deposit(double amount) {
        this.bank.deposit(amount);
    }

    private Boolean isUser() {
        return (Company.user == User.OWNER);
    }

    @Override public boolean withdraw(double amount) {
        if (!(this.isUser())) {
            System.out.println("Balance operation not allowed");
            return false;
        }
        else {
            return this.bank.withdraw(amount);
        }
    }

    @Override public double balance() {
        if (!(this.isUser()))
            return Double.NaN;
        else
            return this.bank.balance();
    }
}
