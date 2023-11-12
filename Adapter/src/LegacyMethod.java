public class LegacyMethod implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of "+amount+" rupees using Legacy Method.");
    }

}
