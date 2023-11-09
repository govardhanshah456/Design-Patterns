package factories;

import products.Button;
import products.Checkbox;

public interface GUIFactory {
    public Button renderButton();
    public Checkbox renderCheckbox();
}
