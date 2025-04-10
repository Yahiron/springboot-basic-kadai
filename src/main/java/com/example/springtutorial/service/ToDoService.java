package com.example.springtutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springtutorial.entity.ToDo;
import com.example.springtutorial.repository.ToDoRepository;

@Service
public class ToDoService {
    private final ToDoRepository todoRepository;

    // 依存性の注入（DI）を行う（コンストラクタインジェクション）
    public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;

    }    
 
    public List<ToDo> getAllUsers() {//ここが違う気がする
        return todoRepository.findAll();// ユーザー一括取得
    }
    
    
    
}
