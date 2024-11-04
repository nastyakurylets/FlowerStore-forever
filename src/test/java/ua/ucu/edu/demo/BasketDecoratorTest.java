package ua.ucu.edu.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals("TestItem was put in the basket", description);
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
