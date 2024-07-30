package AdapterPattern;

public class TestAdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new PaymentProcessorAdapter("CreditCard");
        creditCardPayment.processPayment(250.00);

        PaymentProcessor payPalPayment = new PaymentProcessorAdapter("PayPal");
        payPalPayment.processPayment(450.00);
    }
}
