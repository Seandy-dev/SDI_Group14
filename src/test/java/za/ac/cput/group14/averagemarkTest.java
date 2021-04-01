package za.ac.cput.group14;
/* @author : Nikitha Mbokotwana 218337906
        * test class       */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class averagemarkTest {

    averagemark avg = new averagemark();

    @Test
    public void answerToBeTrue()
    {
        assertTrue( true );
    }

    @BeforeAll
    public static void setUp()
    {
        System.out.println();
    }

    @Test
    public void averageEquality()
    {
        assertEquals(8,10,4);
    }

    @Test
    public void averageIdentity()
    {
        assertNotEquals(3,avg.equals(8));
    }

    @Test
    public void averageFail()
    {
        assertNotSame(8, avg.equals(4));
    }


    @Test
    void test_Add() throws Exception{
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Sleep Time");
    }





}
