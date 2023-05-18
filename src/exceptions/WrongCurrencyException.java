package exceptions;

public class WrongCurrencyException extends Exception{
    @Override
    public String getMessage() {
        return "The account is in another currency.";
    }
}
