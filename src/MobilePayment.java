public class MobilePayment extends Payment {
    private String phoneNumber;

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public MobilePayment(String namePayment, double balance, String currency, String phoneNumber) {
        super(namePayment, balance, currency);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void authorize() {
        System.out.println("Подключение к банку через номер телефона...");
    }

    @Override
    protected String getPaymentDetail() {
        return phoneNumber;
    }
}