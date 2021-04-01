package za.ac.cput.group14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
//Author: Devon Sherwyn May - 219168296


public class testGroup
{
    private grp Group1;
    private grp Group2;

    @BeforeEach
    void setUp()
    {
        Group1 = new grp();
        Group2 = new grp();
    }

    @Test
    void testIdentity()              //Tests Identity
    {
        assertSame(Group1, Group1);

    }

    @Test
    void testEquality()         // Test Equality
    {
        assertEquals(Group2, Group2);
    }

    @Test
    void testFail()         // Tests deliberate failure
    {
        assertSame(Group2, Group2);
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

