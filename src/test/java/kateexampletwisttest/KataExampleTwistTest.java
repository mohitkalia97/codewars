package kateexampletwisttest;

import kataexampletwist.KataExampleTwist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/*
This is an easy twist to the example kata
(provided by Codewars when learning how to create your own kata).
Add the value "codewars" to the array websites 1,000 times.
*/
public class KataExampleTwistTest {
    @Test
    public void testKataExampleTwist(){
        String[] websites = KataExampleTwist.kataExampleTwist();
        assertNotNull(websites);
        assertEquals(1000, websites.length);
        for (String website : websites) {
            assertEquals("codewars", website);
        }
    }
}
