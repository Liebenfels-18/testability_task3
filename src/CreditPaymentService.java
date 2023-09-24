public class CreditPaymentService {
    public int calculate(int creditAmount, double interestRate, int creditPeriodInYears) {
        creditPeriodInYears = creditPeriodInYears * 12; //кол-во месяцев кредитования
        interestRate = interestRate / 12 / 100; //процентная ставка в месяц
        double monthlyPayment = creditAmount * ((interestRate * (Math.pow(1 + interestRate, creditPeriodInYears))) / ((Math.pow(1 + interestRate, creditPeriodInYears)) - 1));

        return (int) monthlyPayment;
    }
}
