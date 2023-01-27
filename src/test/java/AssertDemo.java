import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AssertDemo {
    @Test
    public void testNumberEqual() {
        assertEquals("numbers not equal", 10, 10);
    }

    @Test
    public void testEqualString() {
        assertEquals("strings not equal", "hello", "hello");
    }

    @Test
    public void testAlwaysTrue() {
        assertTrue("failed: this should always be true", 2 > 1);
    }

    @Test
    public void testAlwaysFalse() {
        assertFalse("failed: this should always be false", 2 < 1);
    }

    @Test
    public void testNotNull() {
        assertNotNull("failed: this should not be null", new Object());
    }

    @Test
    public void testNull() {
        List<Integer> list = null;
        assertNull("failed: this should be null", list);
    }

    @Test
    public void testEqualArrays() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        assertArrayEquals("fail: arrays not equal", a, b);
    }

    @Test
    public void testAssertNotSame() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        assertEquals(s1, s2); // check connect of object
        assertNotSame("should be same Object", s1, s2); // check reference of object
    }

    @Test
    public void testAssertSame() {
        String s1 = "hello";
        String s2 = "hello";
        assertEquals(s1, s2);
        assertSame("should be same Object", s1, s2);
    }
}
