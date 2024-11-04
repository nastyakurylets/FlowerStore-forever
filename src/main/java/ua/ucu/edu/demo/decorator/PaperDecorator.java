package ua.ucu.edu.demo.decorator;

import ua.ucu.edu.demo.order.Item;

public class PaperDecorator extends ItemDecorator{

    public PaperDecorator(Item decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return decoratedItem.getName() + " was wrapped in paper";
    }

    @Override
    public int getPrice() {
        return 13 + decoratedItem.getPrice();
    }
}
