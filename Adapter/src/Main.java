// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentGateway oldPayment = new LegacyMethod();
        oldPayment.processPayment(20);
        NewPaymentGateway newPayment = new ModernPaymentGateway();
        PaymentGateway newPaymentAdapter = new PaymentGatewayAdapter(newPayment);
        newPaymentAdapter.processPayment(20);
    }
}