package Behaviour.Stretegy;

public class PayPalStretegy implements PaymentStretegy{
    @Override
    public String paymentStretegy() {
        return "Payment By Paypal";
    }

    @Override
    public void paymentStatus() {
        System.out.println("Paypal Payment Successfull");
    }
}
