public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        bankApplication.checkProcess("accountId000",50,"USD");
        bankApplication.checkProcess("accountId003", 250, "HRV");
        bankApplication.checkProcess("accountId001", 50, "EUR");
        bankApplication.checkProcess("accountId001", 50, "USD");
        bankApplication.checkProcess("accountId001", 50, "USD");
    }
}
