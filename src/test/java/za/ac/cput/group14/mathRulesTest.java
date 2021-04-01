package za.ac.cput.group14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class mathRulesTest {
    /**
     * @author 209024666 Hlombekazi Mbelu
     *
     * Test method!!
     */
   mathRules maths = new mathRules();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @BeforeAll
    public static void setUp() throws Exception
    {
        System.out.println("");
    }


    @Test
    public  void quantityEquality()
    {
        assertEquals(12, maths.sum(2 , 10));
    }

    @Test
    public  void quantityIdentity()
    {
        assertNotEquals(2,maths.quantity(0,0,1));
    }

    @Test
    public  void quantityFail()
    {
     assertNotSame(2, maths.quantity(2,3,5));
    }


    @Test
    void test_Add() throws Exception{
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Sleep Time");
    }

    @Test
    @Disabled
     void disablingTest()
    {
        assertEquals(6, maths.sum(5,1));
    }

}