package za.ac.cput.group14;
/**
 * Name: Sindiswa Mbhele
 * Student no: 219279616
 * Date: 30 March 2021
 * This program demonstrate five tests
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class PetTest {
    Pet cat, mice;

    @BeforeEach
    public void setUp(){
        cat = new Pet();
        mice = new  Pet();
        cat = mice;
    }

    @Test
    public void testEquality(){

        Assertions.assertEquals(cat, mice);
    }


    @Test
    public void testIdentity() {
        assertSame(cat, mice);
    }

    @Test
    public void testFail(){
        fail("Im destined to fail");
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    @Disabled
    public  void testDisable(){
        fail("The test should be ignored because it is being developed. ");
    }

}
