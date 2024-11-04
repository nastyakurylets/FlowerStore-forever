package ua.ucu.edu.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ua.ucu.edu.demo.decorator.BasketDecorator;
import ua.ucu.edu.demo.order.Item;

class BasketDecoratorTest {

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

        BasketDecorator basketDecorator = new BasketDecorator(item);
        String description = basketDecorator.getDescription();

        assertTrue(description.contains("TestItem was put in the basket"));
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

        Item basketDecorator = new BasketDecorator(item);
        int price = basketDecorator.getPrice();

        assertEquals(14, price);
    }
}
