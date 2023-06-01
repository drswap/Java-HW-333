public class CreditPaymentService {
    public double calculate(double totalMonth) {
        double monthlyInterestRate = 9.99 / 12 / 100;
        double monthlyPay = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, totalMonth)) / (Math.pow(1 + monthlyInterestRate, totalMonth) - 1);
        return monthlyPay;
    }
}
