import factories.GUIFactory;
import factories.MacFactory;
import factories.WindowsFactory;
import products.Button;
import products.Checkbox;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String osType;
        Scanner myObj = new Scanner(System.in);
        osType = myObj.next();
        GUIFactory factory;
        if(osType.equalsIgnoreCase("windows")){
            factory = new WindowsFactory();
        }
        else if(osType.equalsIgnoreCase("mac")){
            factory=new MacFactory();
        }
        else{
            throw new RuntimeException("Invlaid OS type.");
        }
        Button button=factory.renderButton();
        Checkbox checkbox=factory.renderCheckbox();
        button.renderButton();
        checkbox.renderCheckox();
    }
}