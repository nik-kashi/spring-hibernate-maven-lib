import com.mohi.spring.models.Task;
import com.mohi.spring.services.TaskService;
import conf.Conf;
import org.junit.Before;
import org.junit.Ignore;
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

    @Before
    public void init(){
        Task task = new Task("task1");
        taskService.addTask(task);
        assertThat(task.getId()).isNotNull();

    }
    @Test
    public void createTask() {
    }

    @Test(expected = Exception.class)
    public void createTask_duplicatedName_preventSaving(){
        Task task1=new Task("task1");
        taskService.addTask(task1);
    }

    @Ignore
    @Test(expected = TaskService.InvalidTaskStatus.class)
    public void createTask_taskTitleStartWith2_preventIfEnabled(){
        Task task=new Task("212");
        task.setEnable(true);
        taskService.addTask(task);

    }


    @Test
    public void createTask_taskTitleStartWith2_setStatusDisable(){
        Task task=new Task("212");
        task.setEnable(true);
        taskService.addTask(task);

        assertThat(task.getEnable()).isFalse();

    }
}
