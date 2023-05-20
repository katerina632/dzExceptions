import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BankApplication bankApplication = new BankApplication();

        //1
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("No such account exists.");
        } catch (WrongCurrencyException e) {
            System.out.println("Account is in another currency.");
        } catch (WrongOperationException e) {
            System.out.println("Account does not have enough funds.");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again.");
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //2
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("No such account exists.");
        } catch (WrongCurrencyException e) {
            System.out.println("Account is in another currency.");
        } catch (WrongOperationException e) {
            System.out.println("Account does not have enough funds.");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again.");
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //3
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException e) {
            System.out.println("No such account exists.");
        } catch (WrongCurrencyException e) {
            System.out.println("Account is in another currency.");
        } catch (WrongOperationException e) {
            System.out.println("Account does not have enough funds.");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again.");
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //4
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("No such account exists.");
        } catch (WrongCurrencyException e) {
            System.out.println("Account is in another currency.");
        } catch (WrongOperationException e) {
            System.out.println("Account does not have enough funds.");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again.");
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //5
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("No such account exists.");
        } catch (WrongCurrencyException e) {
            System.out.println("Account is in another currency.");
        } catch (WrongOperationException e) {
            System.out.println("Account does not have enough funds.");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again.");
        } finally {
            System.out.println("Thank you for using our service!");
        }


    }
}
