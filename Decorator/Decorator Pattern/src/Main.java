import Pizza.BasePizza;
import Pizza.Farmhouse;
import Pizza.Margerita;
import Toppings.Cheese;
import Toppings.Paneer;
import Toppings.Tomato;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new Margerita();
        pizza=new Paneer(pizza);
        pizza=new Tomato(pizza);
        ArrayList<BasePizza> orders =new ArrayList<BasePizza>();
        orders.add(pizza);
        BasePizza pizza1=new Farmhouse();
        pizza1=new Cheese(pizza1);
        orders.add(pizza1);
        orders.forEach((pizzaa)->System.out.println("Your Pizza:"+pizzaa.getDescription()+".\nYour cost:"+pizzaa.getPrice()+"\n"));
    }
}