public abstract class TemplateClass {
    public void start(){
        this.initialize();
        this.startServer();
        this.startClient();
    }
    public abstract void initialize();
    public abstract void startServer();

    public abstract void startClient();

}
