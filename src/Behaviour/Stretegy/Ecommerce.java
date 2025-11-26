package Behaviour.Stretegy;

import java.util.Scanner;

public class Ecommerce {
    private PaymentStretegy paymentStretegy;
    public Ecommerce(PaymentStretegy paymentStretegy){
        this.paymentStretegy = paymentStretegy;
    }

    public void setPaymentStretegy(PaymentStretegy paymentStretegy) {
        this.paymentStretegy = paymentStretegy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Payment Method");
        String st = sc.nextLine();
        Ecommerce ecommerce = new Ecommerce(new CreditCardStretegy());
        if(st.equalsIgnoreCase("CreditCard")){
            ecommerce.setPaymentStretegy(new CreditCardStretegy());
        }
        else if(st.equalsIgnoreCase("PayPal")){
            ecommerce.setPaymentStretegy(new PayPalStretegy());
        }
        else{
            ecommerce.setPaymentStretegy(new CashStretegy());
        }
        ecommerce.paymentStretegy.paymentStatus();
    }
}
