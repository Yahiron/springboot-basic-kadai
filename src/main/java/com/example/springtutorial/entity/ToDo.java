package com.example.springtutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "todos")
@Data
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;//id

    @Column(name = "title")
    private String Title;//タイトル

    @Column(name = "priority")
    private String Priority;//優先度

    @Column(name = "status")
    private String Status;//ステータス
	
}
