package convertstringtocamelcasetest;

import convertstringtocamelcase.StringToCamelCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToCamelCaseTest {
    @ParameterizedTest
    @CsvSource({
            "the-stealth-warrior, theStealthWarrior",
            "The_Stealth_Warrior, TheStealthWarrior",
            "The_Stealth-Warrior, TheStealthWarrior"
    })
    public void StringToCamelCaseTest(String output, String expectedOutput){

        assertEquals(expectedOutput, StringToCamelCase.StringToCamelCase(output));
    }
}
