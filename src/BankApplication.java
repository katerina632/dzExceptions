import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankApplication {

    private final List<Account> accounts = new ArrayList<>() {{
        add(new Account("accountId001", 100, "USD"));
        add(new Account("accountId002", 500, "EUR"));
        add(new Account("accountId003", 250, "HRV"));
        add(new Account("accountId004", 1000, "USD"));
        add(new Account("accountId005", 750, "USD"));
        add(new Account("accountId006", 50, "USD"));
    }};

    public void checkProcess(String accountId, int amount, String currency) {
        try {
            process(accountId, amount, currency);
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


    public void process(String accountId, int amount, String currency) throws Exception {

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .findAny().orElseThrow(WrongAccountException::new);

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .findAny().orElseThrow(WrongCurrencyException::new);

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount)
                .findAny().orElseThrow(WrongOperationException::new);


        Account desiredAccount = accounts.stream()
                .filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount).findAny()
                .orElseThrow();

        int randomInt = new Random().nextInt(2);

       if(randomInt == 1){
           throw new Exception();
       }

        desiredAccount.setBalance(desiredAccount.getBalance() - amount);
    }
}
