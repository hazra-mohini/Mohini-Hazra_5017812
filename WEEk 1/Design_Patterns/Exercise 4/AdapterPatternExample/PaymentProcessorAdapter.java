package AdapterPatternExample;

public class PaymentProcessorAdapter implements PaymentProcessor {
    private CreditCardPayment creditCardPayment;
    private PayPalPayment payPalPayment;
    private String type;

    public PaymentProcessorAdapter(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            creditCardPayment = new CreditCardPayment();
        } else if (type.equalsIgnoreCase("PayPal")) {
            payPalPayment = new PayPalPayment();
        }
        this.type = type;
    }

    @Override
    public void processPayment(double amount) {
        if (type.equalsIgnoreCase("CreditCard")) {
            creditCardPayment.payByCreditCard(amount);
        } else if (type.equalsIgnoreCase("PayPal")) {
            payPalPayment.payByPayPal(amount);
        }
    }
}
