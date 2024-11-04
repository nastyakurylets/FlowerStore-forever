package ua.ucu.edu.demo.decorator;

import ua.ucu.edu.demo.order.Item;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return decoratedItem.getName() + "was put in the basket";
    }

    @Override
    public int getPrice() {
        return 4 + decoratedItem.getPrice();
    }
}
