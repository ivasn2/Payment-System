public class BankCard extends Payment {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankCard(String namePayment, double balance, String currency, String cardNumber) {
        super(namePayment, balance, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void authorize() {
        System.out.println("Авторизация банковской карты...");
    }

    @Override
    protected String getPaymentDetail() {
        return cardNumber;
    }

    @Override
    protected String getInsufficientFundsMessage() {
        return "Недостаточно средств на карте";
    }
}
