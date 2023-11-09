package factories;

import products.Button;
import products.Checkbox;
import products.MacButton;
import products.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button renderButton() {
        return new MacButton();
    }

    @Override
    public Checkbox renderCheckbox() {
        return new MacCheckbox();
    }
}
