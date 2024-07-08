import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;
    private Person person1;
    @BeforeEach
    void setUp() {

        person = new Person(1,"Sheeba", "Leo", "abc@xyz");
        person1 = new Person(1,"Sheeba", "Leo", "abc@xyz");
    }

    @Test
    void testPersonConstructor() {
        assertNotNull(person.getId());
        assertNotNull("Sheeba", person.getFirstName());
        assertNotNull("Leo", person.getLastName());
        assertNotNull("abc@xyz", person.getEmail());
    }

   /* @Test
    void testGetSummary() {
        String expectedInfo = String.format("Person{ id=%s, firstName=Sheeba, LastName=Leo, email=abc@xyz }", person.getId());
        assertEquals(expectedInfo, person.getSummary());
    }*/

    @Test
    void testEqual() {
        assertTrue(person.equals(person1));

    }

    @Test
    void testHashCode() {
        assertEquals("Sheeba", person.getFirstName());
        assertEquals("Leo", person.getLastName());
    }

    @Test
    void testToString() {
        String expected = "Person{username='Sheeba', lastName='Leo'}";
        assertEquals(expected, person.toString());
    }
}
