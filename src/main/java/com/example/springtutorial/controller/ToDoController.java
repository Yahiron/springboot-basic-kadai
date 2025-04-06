package com.example.springtutorial.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springtutorial.entity.ToDo;
import com.example.springtutorial.service.ToDoService;

@Controller
public class ToDoController {
private final ToDoService todoService;
	
	public ToDoController(ToDoService todoService){
	this.todoService = todoService;
	
	}
	
    @GetMapping("/todo")
    public String todoList(Model model) { 	    	
    List<ToDo> todos =  todoService.getAllUsers();
        		
        
        model.addAttribute("todos",todos);

        return "todoView";
   
}
}

