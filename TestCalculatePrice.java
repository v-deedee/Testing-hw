import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatePrice {
    @Test
    public void checkCalculatePrice() {
        assertEquals(350000, Main.calculatePrice("hardcover", 200));
        assertEquals(-1, Main.calculatePrice("abc", 100));
        assertEquals(250000, Main.calculatePrice("paperback", 150));
        assertEquals(-1, Main.calculatePrice("hardcover", -10));
        assertEquals(1025000, Main.calculatePrice("hardcover", 500));
        assertEquals(1600000, Main.calculatePrice("paperback", 800));
    }
}