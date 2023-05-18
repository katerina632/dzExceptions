package exceptions;

public class WrongOperationException extends Exception{
    @Override
    public String getMessage() {
        return "Account does not have enough funds.";
    }
}
