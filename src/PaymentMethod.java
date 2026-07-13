public interface PaymentMethod {
    // абстрактный-метод (без тела)
    void authorize();

    // абстрактный-метод (без тела)
    void pay(double amount);

    // default-метод
    default void generateReceipt(double amount, String paymentDetails, String currency) {
        System.out.println("ЧЕК");
        System.out.println("------------------------");
        System.out.println("Сумма платежа: " + amount);
        System.out.println("Детали счета: " + paymentDetails + ", " + currency);
        System.out.println("------------------------");
    }

    // static-метод
    static boolean isValidAmount(double amount) {
        return amount > 0;
    }

}
