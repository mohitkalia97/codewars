package kateexampletwisttest;

import kataexampletwist.KataExampleTwist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
