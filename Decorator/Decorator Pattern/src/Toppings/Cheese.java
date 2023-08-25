package Toppings;

import Decorator.ToppingsDecorator;
import Pizza.BasePizza;

public class Cheese extends ToppingsDecorator {
    BasePizza pizza;
    public Cheese(BasePizza pizza){
        this.pizza=pizza;

    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" and Cheese";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice()+50;
    }
}
