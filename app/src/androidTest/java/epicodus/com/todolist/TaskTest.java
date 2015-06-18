package epicodus.com.todolist;

import org.junit.Test;
import static org.junit.Assert.*;

import epicodus.com.todolist.models.Task;

/**
 * Created by jake on 6/17/15.
 */
public class TaskTest {

    @Test
    public void getDescription_returnsADescription() {
        Task testTask = new Task();
        testTask.setDescription("Wash the dishes");

        assertEquals(testTask.getDescription(), "Wash the dishes");
    }
}
