import exceptions.WrongAccountException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        //1
        try {
            bankApplication.process("accountId000",50, "USD");
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //2
        try {
            bankApplication.process("accountId003",250, "HRV");
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //3
        try {
            bankApplication.process("accountId001",50, "EUR");
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //4
        try {
            bankApplication.process("accountId001",50, "USD");
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }

        //5
        try {
            bankApplication.process("accountId001",50, "USD");
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }

    }
}
