public class ProcessFacade {
    private PaymentGateway paymentGateway;
    private Inventory inventory;

    public ProcessFacade() {
        this.paymentGateway = new PaymentGateway();
        this.inventory = new Inventory();
        this.sendEmail = new Sendemail();
    }

    private Sendemail sendEmail;
    public void ProcessOrder(int productId,int quantity,String email,double amount){
        this.paymentGateway.processPayemt(amount);
        this.sendEmail.emailSender(email);
        this.inventory.updateInventory(quantity,productId);
    }
}
