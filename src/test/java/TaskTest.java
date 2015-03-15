import com.mohi.spring.models.Task;
import com.mohi.spring.services.TaskService;
import conf.Conf;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by mohsen on 3/15/15.
 */
@ContextConfiguration(classes = {Conf.class})
public class TaskTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private TaskService taskService;

    @Test
    public void createTask() {
        Task task = new Task("task1");
        taskService.addTask(task);
        assertThat(task.getId()).isNotNull();
    }
}
