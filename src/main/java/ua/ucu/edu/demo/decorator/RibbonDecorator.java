package ua.ucu.edu.demo.decorator;

import ua.ucu.edu.demo.order.Item;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return "To" + decoratedItem.getName() + "the ribbon was added";
    }

    @Override
    public int getPrice() {
        return 40 + decoratedItem.getPrice();
    }
}
