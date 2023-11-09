package factories;

import products.Button;
import products.Checkbox;
import products.WindowsButton;
import products.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button renderButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox renderCheckbox() {
        return new WindowsCheckbox();
    }
}
