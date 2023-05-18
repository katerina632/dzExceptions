package exceptions;

public class WrongAccountException extends Exception{
    @Override
    public String getMessage() {
        return "No such account exists";
    }
}
