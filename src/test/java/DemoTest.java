
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import jones.Demo;

public class DemoTest {
    @Test
    @DisplayName("Multiply By Five")
    void testMultiplyByFive() {
        Assertions.assertEquals(25, Demo.multiplyByFive(5), "Multiply By Five Failed");
    }

    @Test
    @DisplayName("Add Two")
    void testAddTwo() {
        Assertions.assertEquals(7, Demo.addTwo(5), "Add Two Failed");
    }
}
