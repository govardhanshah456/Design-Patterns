package Pizza;

public class Farmhouse extends BasePizza{
    public  Farmhouse(){
        this.description="Farmhouse Pizza";
    }
    @Override
    public float getPrice() {
        return 180;
    }
}
