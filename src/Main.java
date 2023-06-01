public class Main {
    public static void main(String[] args) {
        int amountCredit = 1_000_000;
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPay = service.calculate(12);
        System.out.println("Monthly pay 1 yr=" + monthlyPay * amountCredit);
        monthlyPay = service.calculate(24);
        System.out.println("Monthly pay 2 yr=" + monthlyPay * amountCredit);
        monthlyPay = service.calculate(36);
        System.out.println("Monthly pay 3yr=" + monthlyPay * amountCredit);
    }
}
