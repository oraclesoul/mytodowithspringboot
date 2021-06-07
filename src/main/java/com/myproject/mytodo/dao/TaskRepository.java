package com.myproject.mytodo.dao;

import com.myproject.mytodo.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
