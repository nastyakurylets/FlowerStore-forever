package ua.ucu.edu.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ua.ucu.edu.demo.decorator.RibbonDecorator;
import ua.ucu.edu.demo.order.Item;

class RibbonDecoratorTest {

    @Test
    void testGetDescription() {
        Item item = new Item() {
            @Override
            public String getName() {
                return "TestItem";
            }

            @Override
            public int getPrice() {
                return 10;
            }
        };

        RibbonDecorator ribbonDecorator = new RibbonDecorator(item);
        String description = ribbonDecorator.getDescription();

        assertTrue(description.contains("To TestItem the ribbon was added"));
    }

    @Test
    void testGetPrice() {
        Item item = new Item() {
            @Override
            public String getName() {
                return "TestItem";
            }

            @Override
            public int getPrice() {
                return 10;
            }
        };

        Item ribbonDecorator = new RibbonDecorator(item);
        int price = ribbonDecorator.getPrice();

        assertEquals(50, price);
    }
}