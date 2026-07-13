public abstract class Payment implements PaymentMethod {

    private String paymentName;
    private double balance;
    private String currency;

    public Payment(String namePayment, double balance, String currency) {
        this.paymentName = namePayment;
        this.balance = balance;
        this.currency = currency;
    }

    public String getNamePayment() { return paymentName; }
    public double getBalance() { return balance; }
    public String getCurrency() { return currency; }

    public void setBalance(double balance) { this.balance = balance; }


    protected abstract String getPaymentDetail();

    public abstract void authorize();

    protected String getInsufficientFundsMessage() {
        return "Недостаточно средств";
    }

    @Override
    public void pay(double amount) {
        if (getBalance() >= amount) {
            authorize();
            setBalance(getBalance() - amount);
            System.out.println("Успешная оплата!");
            generateReceipt(amount, getNamePayment(), getCurrency());
        } else {
            System.out.println("Недостаточно средств на карте");
        }
    }
}
