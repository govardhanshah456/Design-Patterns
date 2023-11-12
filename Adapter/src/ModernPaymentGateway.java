public class ModernPaymentGateway implements NewPaymentGateway{
    @Override
    public void processPaymentNew(double amount) {
        System.out.println("Processing Payment of "+amount+" rupees by new Payment Gateway");
    }
}
