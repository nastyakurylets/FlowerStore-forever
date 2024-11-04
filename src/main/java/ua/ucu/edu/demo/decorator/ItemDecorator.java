package ua.ucu.edu.demo.decorator;

import ua.ucu.edu.demo.order.Item;

public abstract class ItemDecorator extends Item {
    protected Item decoratedItem;

    public ItemDecorator(Item decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    public abstract String getDescription();
}