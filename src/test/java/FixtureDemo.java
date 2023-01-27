import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class FixtureDemo {
    @Before
    public void setUp() {
        System.out.println("FixtureDemo.setUp");
    }

    @After
    public void tearDown() {
        System.out.println("FixtureDemo.tearDown");
    }

    @Test
    public void testDemo1() {
        System.out.println("FixtureDemo.testDemo1");
    }

    @Test
    public void testDemo2() {
        System.out.println("FixtureDemo.testDemo2");
    }

    @Ignore
    @Test
    public void failOnPurpose() {
        fail("failed the test on purpose");
    }
}
