package Pizza;

public class Margerita extends BasePizza{
    public  Margerita(){
        this.description="Margerita Pizza";
    }
    @Override
    public float getPrice() {
        return 120;
    }
}
