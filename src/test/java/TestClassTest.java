import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {
    private TestClass tc ;

    @Before
    public void setUp() throws Exception {
        tc = new TestClass();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void equ()
    {
        String r = tc.equ();
        Assert.assertEquals("Dani", 3);

    }

    public void iden(Object x, Object y){

        assertEquals(x , y);
        System.out.println("match");
        assertNotSame(x ,y);
    }

    public  void failTest(int x , int y){
        int count;
        count = x + y;
    }
}