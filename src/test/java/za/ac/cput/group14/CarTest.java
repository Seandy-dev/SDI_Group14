package za.ac.cput.group14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class CarTest
{
    private Car vehicle1;
    private Car vehicle2;

    @BeforeEach
    void setUp()
    {
        vehicle1 = new Car();
        vehicle2 = new Car();
    }

    @Test
    void testIdentity()              //Tests Identity
    {
        assertSame(vehicle1, vehicle1);

    }

    @Test
    void testEquality()         // Test Equality
    {
        assertEquals(vehicle2, vehicle2);
    }

    @Test
    void testFail()         // Tests deliberate failure
    {
        assertSame(vehicle2, vehicle2);
        fail("this test was deliberately made to fail by student 219168296");
    }
    @Timeout(3)
    @Test
    void testTimeoutLoop() throws Exception      // Tests timeout after 3 seconds
    {
        while (true)
        {
            Thread.sleep(1000);
        }
    }
}

class DisabledTest                              //tests deliberate disabled
{
    @Disabled("Test was disabled by student 219168296.")
    @Test
    void TestDisabled()
    {
        System.out.println("If i appear in output, that means i was not disabled successfully");
    }
}
