package helloworldwithoutstringstest;


import helloworldwithoutstring.HelloWorldWithoutStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldWithoutStringsTest {
    @Test
    public void helloWorldTest(){
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, HelloWorldWithoutStrings.helloWorld());
    }

}
