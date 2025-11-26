package Behaviour.Stretegy;

public class CashStretegy implements PaymentStretegy{

    @Override
    public String paymentStretegy() {
        return "Payment By Cash";
    }

    @Override
    public void paymentStatus() {
        System.out.println("Payment in Cash Successfull ");
    }
}
