package Toppings;

import Decorator.ToppingsDecorator;
import Pizza.BasePizza;

public class Tomato extends ToppingsDecorator {
    BasePizza pizza;
    public Tomato(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" and Tomatos";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice()+20;
    }
}
