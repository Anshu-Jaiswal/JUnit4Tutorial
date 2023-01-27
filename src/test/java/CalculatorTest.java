import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testIsEven() {
        assertTrue(Calculator.isEven(6));
        assertFalse(Calculator.isEven(5));
    }

    @Test
    public void testIsOdd(){
      assertTrue(Calculator.isOdd(5));
      assertFalse(Calculator.isOdd(6));
    }
}