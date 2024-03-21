import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatePrice {
    @Test
    public void checkCalculatePrice() {
        assertEquals(-1, Main.calculatePrice("hardcover", -10));
        assertEquals(425000, Main.calculatePrice("hardcover", 250));
        assertEquals(825000, Main.calculatePrice("hardcover", 400));
        assertEquals(-1, Main.calculatePrice("hakcns", 400));
        assertEquals(325000, Main.calculatePrice("paperback", 200));
        assertEquals(1000000, Main.calculatePrice("paperback", 500));
    }
}