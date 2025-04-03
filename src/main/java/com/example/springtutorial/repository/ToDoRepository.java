package com.example.springtutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtutorial.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

	List<ToDo> findByTitle(String title); 
	//必要？
}

