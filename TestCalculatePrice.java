import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatePrice {
    @Test
    public void checkCalculatePrice() {
       // kiểm thử bảng quyết định
       assertEquals(-1, Main.calculatePrice("hardcover", -10));
       assertEquals(200000, Main.calculatePrice("hardcover", 100));
       assertEquals(1625000, Main.calculatePrice("hardcover", 800));
       assertEquals(-1, Main.calculatePrice("hardcover", 2500));
       assertEquals(-1, Main.calculatePrice("paperback", -20));
       assertEquals(325000, Main.calculatePrice("paperback", 200));
       assertEquals(3200000, Main.calculatePrice("paperback", 1600));
       assertEquals(-1, Main.calculatePrice("paperback", 3000));

       // kiểm thử giá trị biên
       assertEquals(51500, Main.calculatePrice("hardcover", 1));
       assertEquals(53000, Main.calculatePrice("hardcover", 2));
       assertEquals(2025000, Main.calculatePrice("hardcover", 1000));
       assertEquals(4021000, Main.calculatePrice("hardcover", 1998));
       assertEquals(4023000, Main.calculatePrice("hardcover", 1999));
       assertEquals(26500, Main.calculatePrice("paperback", 1));
       assertEquals(28000, Main.calculatePrice("paperback", 2));
       assertEquals(2000000, Main.calculatePrice("paperback", 1000));
       assertEquals(3996000, Main.calculatePrice("paperback", 1998));
       assertEquals(3998000, Main.calculatePrice("paperback", 1999));
    }
}