import org.junit.Test;

import static org.junit.Assert.fail;

public class TestClass {
    public static void main(String[] args) {

    }
    @Test
    public void equ(){
        Object a = 2;
        String b = "Dani";


    }

    @Test
    public void iden(){
        int a = 1;
        Object b = 8;

    }

    @Test
    public void failTest(){
        int x = 10;
        Object a = "Danielle";
        fail("execption");
    }
}
