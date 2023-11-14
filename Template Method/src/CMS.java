public class CMS extends TemplateClass{
    @Override
    public void initialize() {
        System.out.println("Initialized CMS Project");
    }

    @Override
    public void startServer() {
        System.out.println("Started Server Of CMS Project");
    }

    @Override
    public void startClient() {
        System.out.println("Started Client of CMS Project");
    }
}
