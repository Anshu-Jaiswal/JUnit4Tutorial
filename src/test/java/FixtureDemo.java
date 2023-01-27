import org.junit.*;

import static org.junit.Assert.fail;

public class FixtureDemo {
    @BeforeClass
    public static void beforeEverything() {
        System.out.println("Before Class Annotation");
    }

    @AfterClass
    public static void afterEverything() {
        System.out.println("After Class Annotation");
    }

    @Before  // before every function
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
