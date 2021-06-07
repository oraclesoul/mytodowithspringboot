package com.myproject.mytodo.controllers;

import com.myproject.mytodo.entities.Task;

import com.myproject.mytodo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    TaskService taskService;

    public HomeController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public ModelAndView handleHome()
    {
        Task task = new Task();
        ModelAndView mv = new ModelAndView();
        mv.addObject("Task",task);
        mv.addObject("Tasks",taskService.getAllTask());
        mv.addObject("name","manshu");
        mv.setViewName("home");
        return mv;
    }


    @PostMapping("/new")
    public ModelAndView addNewTask(@ModelAttribute Task t)
    {
          System.out.println(t.toString());

          String message = taskService.addNewTask(t);
          System.out.println(message);
          return new ModelAndView("redirect:/");
    }

    @PostMapping("/delete/{tId}")
    public ModelAndView deleteTask(@PathVariable("tId") long tId )
    {

          String message = taskService.deleteTask(tId);
          System.out.println(message);
          return new ModelAndView("redirect:/");
    }



}
