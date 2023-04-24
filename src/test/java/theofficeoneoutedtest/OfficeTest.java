package theofficeoneoutedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import theofficeoneouted.Office;
import theofficeoneouted.Person;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OfficeTest {
    static Person[] testData(){
        Person[] meet = new Person[]{
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        return meet;
    }
    @ParameterizedTest
    @MethodSource("testData")
    public void testOffice(Person[] meet) {
        assertEquals("Get Out Now!", Office.outed(meet, "laura"));
    }
    static Person[] testData2(){
        Person[] meet = new Person[]{
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        return meet;
    }
    @ParameterizedTest
    @MethodSource("testData2")
    public void testOffice2(Person[] meet) {
        assertEquals("Nice Work Champ!", Office.outed(meet, "katie"));
    }
    static Person[] testData3(){
        Person[] meet = new Person[]{
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8),
        };
        return meet;
    }
    @ParameterizedTest
    @MethodSource("testData3")
    public void testOffice3(Person[] meet) {
        assertEquals("Get Out Now!", Office.outed(meet, "laura"));
        assertEquals("Nice Work Champ!", Office.outed(meet, "john"));
    }
}
