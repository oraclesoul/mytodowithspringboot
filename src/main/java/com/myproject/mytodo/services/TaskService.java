package com.myproject.mytodo.services;

import com.myproject.mytodo.entities.Task;
import com.myproject.mytodo.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements TaskServiceInterface {

    @Autowired
    TaskRepository taskDb;


    public TaskService() {
    }

    @Override
    public List<Task> getAllTask()
    {
        return (List<Task>) taskDb.findAll();
    }

    @Override
    public String addNewTask(Task t)
    {
        try
        {
             taskDb.save(t);
        }
        catch (Exception e)
        {
            return e.toString();
        }
        return "OK";
    }
    @Override
    public String deleteTask(long tId)
    {
        try
        {
            taskDb.deleteById(tId);
        }
        catch(Exception e)
        {
            return e.toString();
        }
        return "OK";
    }

    @Override
    public Optional<Task> findTask(long tId) {
        return taskDb.findById(tId);
    }

}
