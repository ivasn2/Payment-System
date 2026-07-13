public class Cryptocurrency extends Payment {
    private String address;

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Cryptocurrency(String namePayment, double balance, String currency, String address) {
        super(namePayment, balance, currency);
        this.address = address;
    }

    @Override
    public void authorize() {
        System.out.println("Подключение к кошельку по адресу...");
    }

    @Override
    protected String getPaymentDetail() {
        return address;
    }

    @Override
    protected String getInsufficientFundsMessage() {
        return "Недостаточно средств на криптокошельке";
    }
}