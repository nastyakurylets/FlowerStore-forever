package ua.ucu.edu.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.ucu.edu.demo.decorator.PaperDecorator;
import ua.ucu.edu.demo.order.Item;

class PaperDecoratorTest {

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

        PaperDecorator paperDecorator = new PaperDecorator(item);
        String description = paperDecorator.getDescription();

        assertEquals("TestItem was wrapped in paper", description);
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

        Item paperDecorator = new PaperDecorator(item);
        int price = paperDecorator.getPrice();

        assertEquals(23, price);
    }
}
