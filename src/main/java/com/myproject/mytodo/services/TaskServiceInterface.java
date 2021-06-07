package com.myproject.mytodo.services;

import com.myproject.mytodo.entities.Task;

import java.util.List;
import java.util.Optional;

public interface TaskServiceInterface {
    public List<Task> getAllTask();
    public String addNewTask(Task t);
    public String deleteTask(long tId);
    public Optional<Task> findTask(long tId);
}
