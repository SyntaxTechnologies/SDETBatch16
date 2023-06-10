package class29;

public class BankAccount {
    double balance;

   public BankAccount(double balance) {
        this.balance = balance;
    }

  public   void withdraw(double amountToWithdraw) {
        if (amountToWithdraw > balance) {
          throw new InsufficientBalance("Not possible insufficient balance");
        }
        /*
        balance =100
        100-30;
         */
        balance = balance - amountToWithdraw;
    }
}
