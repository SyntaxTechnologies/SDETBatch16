package class29;

public class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amountToWithdraw) {
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
