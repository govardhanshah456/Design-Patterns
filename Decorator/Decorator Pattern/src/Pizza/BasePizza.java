package Pizza;

public abstract class BasePizza {
    String description="";
    public String getDescription(){
        return description;
    }
    public abstract float getPrice();
}
