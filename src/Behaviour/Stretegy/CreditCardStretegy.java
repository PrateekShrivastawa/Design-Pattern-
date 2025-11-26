package Behaviour.Stretegy;

public class CreditCardStretegy implements PaymentStretegy{
    @Override
    public String paymentStretegy() {
        return "Payment By Credit Card";
    }

    @Override
    public void paymentStatus() {
        System.out.println("Payment Successfull by Credit Card");
    }
}
