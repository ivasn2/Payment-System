public class ElectronicWallet extends Payment {
    private String login;

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public ElectronicWallet(String namePayment, double balance, String currency, String login) {
        super(namePayment, balance, currency);
        this.login = login;
    }

    @Override
    public void authorize() {
        System.out.println("Подключение к электронному кошельку...");
    }

    @Override
    protected String getPaymentDetail() {
        return login;
    }
}