package za.ac.cput.group14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.junit.jupiter.api.Assertions.*;

/*
 *@Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 1 April 2021
 * This is the test class for the Dog class
 */

class DogTest {
    private Dog Jack, Tom, Harry;

    @BeforeEach
    public void setUp() {
        Jack = new Dog();
        Tom = new Dog();
        Harry = Jack;
    }

    @Test
    public void testForEquality() {
        Assertions.assertEquals(Jack, Tom);
    }

    @Test
    public void testForIdentity() {
        Assertions.assertSame(Harry, Jack);
    }

    @Test
    public void getName() {
        org.junit.jupiter.api.Assertions.fail("Make the test false. Not implementing");
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = NANOSECONDS)
    public void testTimeout() {
        System.out.println("Setting the Timeout");
    }
    
    @Test
    @Disabled
    public void testDisable() {
        org.junit.jupiter.api.Assertions.fail("The test should fail. The program is still being developed");
    }
}