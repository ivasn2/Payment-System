import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        BankCard card = new BankCard("Карта", 2234, "RUB", "5462820076234499");
        Cryptocurrency cryptocurrency = new Cryptocurrency("Криптокошелек", 21342, "RUB", "21313");
        ElectronicWallet electronicWallet = new ElectronicWallet("Электронный кошелек", 23123, "USD", "sobakadusya");
        MobilePayment mobilePayment = new MobilePayment("Мобильный счет", 609, "RUB", "+89921092312");

        System.out.println("Выберите способ оплаты: ");
        System.out.println("1 - Карта");
        System.out.println("2 - Электронный кошелек");
        System.out.println("3 - Криптокошелек");
        System.out.println("4 - Телефон");

        int choice;
        double amount;
        try {
            choice = scn.nextInt();
            System.out.println("Введите сумму: ");
            amount = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка ввода: ожидалось число");
            scn.close();
            return;
        }

        if (!PaymentMethod.isValidAmount(amount)) {
            System.out.println("Некорректная сумма платежа");
            return;
        }

        PaymentMethod paymentMethod = null;
        switch (choice) {
            case 1:
                paymentMethod = card;
                paymentMethod.pay(amount);
                break;
            case 2:
                paymentMethod = electronicWallet;
                paymentMethod.pay(amount);
                break;
            case 3:
                paymentMethod = cryptocurrency;
                paymentMethod.pay(amount);
                break;
            case 4:
                paymentMethod = mobilePayment;
                paymentMethod.pay(amount);
                break;
            default:
                System.out.println("Неверный выбор способа оплаты");
        }
        scn.close();
    }
}