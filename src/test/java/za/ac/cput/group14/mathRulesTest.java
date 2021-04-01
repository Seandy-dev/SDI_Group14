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
     * Rigorous Test :-)
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
        assertSame(6, maths.quantity(2,3,6));
    }

    @Test
    public  void quantityFail()
    {
       try
       {
           fail("This test is working on my nerves");
       }catch (final RuntimeException e)
       {
           assertTrue(true);
       }
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