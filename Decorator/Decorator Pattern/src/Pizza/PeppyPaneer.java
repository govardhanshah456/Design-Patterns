package Pizza;

public class PeppyPaneer extends BasePizza{
    public  PeppyPaneer(){
        this.description="Peppy Paneer Pizza";
    }
    @Override
    public float getPrice() {
        return 150;
    }
}
