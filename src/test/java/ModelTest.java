import org.junit.*;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model;

    @Before
    public void initTest() {
        model = new Model();
    }
    @After
    public void afterTest() {
        model = null;
    }

    @Test
    public void testSetSecretValue() {
        for(int i = 0; i < 10000; i++){
            assertEquals(0, model.setSecretValue());
            assertEquals(100, model.setSecretValue());
        }
    }

    void testCheckValue() {
    }

    void testSetPrimaryBarrier() {
    }

    void testGetSecretValue() {
    }

    void testGetMinBarrier() {
    }

    void testGetMaxBarrier() {
    }

    void testGetYourWay() {
    }
}
