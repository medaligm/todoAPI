package com.abolkog.springboot.tuto.todos;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> data= new ArrayList<>(Arrays.asList(
            new Todo(1, "First Todo", "This is the first todo"),
            new Todo(2, "Second Todo", "This is the Second  todo"),
            new Todo(3, "Third Todo", "This is the Third todo"),
            new Todo(4, "Fourth Todo", "This is the Fourth todo"),
            new Todo(5, "Fifth Todo", "This is the Fifth todo")
    ));

    public List<Todo> findAll(){
        return data;
    }

    public Todo getById(int id) {
        for(Todo todo:data){
            if(todo.getId()==id) return todo;
        }
        return null;
    }

    public boolean save(Todo todo){
        return data.add(todo);
    }

    public void delete(int id){
        for (Todo todo: data){
            if(todo.getId()==id){
                data.remove(todo);
            }
        }
    }
}
