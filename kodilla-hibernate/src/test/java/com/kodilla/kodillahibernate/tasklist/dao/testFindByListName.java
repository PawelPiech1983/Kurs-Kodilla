package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.task.Task;
import com.kodilla.kodillahibernate.task.TaskList;
import com.kodilla.kodillahibernate.task.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testFindByListName {

    private TaskListDao taskListDao;
    public final static String LISTNAME = "listName";

    @Test
    void testTaskListFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "description");
        taskListDao.save(taskList);
        String listName  = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTaskLists.size());


    }
}
