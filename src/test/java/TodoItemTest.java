import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemTest {
    private TodoItem todoItem;
    @BeforeEach
    void setUp() {

        //todoItem = new TodoItem(1,"Title", "task1", );
    }

    @Test
    void testTodoItemConstructor() {
        assertNotNull(todoItem.getId());
        assertNotNull("Title", todoItem.getTitle());
        assertEquals("task1", todoItem.getDescription());
        assertNotNull(todoItem.getDeadLine());
        assertFalse(todoItem.isDone());
        assertEquals(todoItem, todoItem.getCreator());

    }
    @Test
    void testGetSummary() {
        String expectedInfo = String.format("Person{ id=%s, firstName=Sheeba, LastName=Leo, email=abc@xyz }", todoItem.getId());
        assertEquals(expectedInfo, todoItem.getSummary());
    }
}
