package com.example.todo.model;

import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
	private List<ToDo> todos;

	public List<ToDo> getTodos() {
		return todos;
	}

	public void setTodos(List<ToDo> todos) {
		this.todos = todos;
	}

	public ToDoManager(List<ToDo> todos) {
		super();
		this.todos = todos;
	}
	
	public ToDoManager() {
		super();
		this.todos = new ArrayList<ToDo>();
	}

	public void removeAtPosition(int position) {
		todos.remove(position);
		
	}

	public ToDo findByPosition(int position) {
		return todos.get(position);
	}

}
