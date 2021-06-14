
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import jones.Demo;

public class DemoTest {
    @Test
    void testMultiplyByFive() {
        Assertions.assertEquals(25, Demo.multiplyByFive(5));
    }

    @Test
    void testAddTwo() {
        Assertions.assertEquals(7, Demo.addTwo(5));
    }
}
