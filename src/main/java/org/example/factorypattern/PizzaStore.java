package org.example.factorypattern;

import org.example.factorypattern.pizza.CheesePizza;
import org.example.factorypattern.pizza.GreekPizza;
import org.example.factorypattern.pizza.PepperoniPizza;
import org.example.factorypattern.pizza.Pizza;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
