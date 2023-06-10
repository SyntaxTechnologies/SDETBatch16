package class29;

/***
 * This exception is thrown when there is no enough balance in the users
 * account
 * and he tries to withdraw more money.
 */
public class InsufficientBalance extends RuntimeException {

    public InsufficientBalance(String errorMsg) {
        super(errorMsg);
    }


}
