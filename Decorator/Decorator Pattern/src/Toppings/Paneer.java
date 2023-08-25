package Toppings;

import Decorator.ToppingsDecorator;
import Pizza.BasePizza;

public class Paneer extends ToppingsDecorator {
    BasePizza pizza;
    public Paneer(BasePizza pizza){
        this.pizza=pizza;

    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" and Paneer";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice()+20;
    }
}
