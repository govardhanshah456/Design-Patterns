public class PaymentGatewayAdapter implements  PaymentGateway{
    private NewPaymentGateway newPaymentGateway;

    public PaymentGatewayAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        newPaymentGateway.processPaymentNew(amount);
    }
}
