package com.example.todo;

import com.example.todo.model.ToDo;
import com.example.todo.model.ToDoManager;

import android.app.Application;

public class ToDoApp extends Application{
	
	private ToDoManager todoManager = null;

	public ToDoManager getTodoManager() {
		if(todoManager == null){
			todoManager = new ToDoManager();
			todoManager.getTodos().add(
					new ToDo(1, "buy milk", 5));
			todoManager.getTodos().add(
					new ToDo(2, "buy bred", 5));
			todoManager.getTodos().add(
					new ToDo(3, "buy beer", 5));
			todoManager.getTodos().add(
					new ToDo(4, "buy apples", 5));
			todoManager.getTodos().add(
					new ToDo(5, "buy bananas", 10));
			todoManager.getTodos().add(
					new ToDo(6, "buy TV", 5));
			todoManager.getTodos().add(
					new ToDo(7, "buy laptop", 5));
			todoManager.getTodos().add(
					new ToDo(8, "buy iphone", 5));
			todoManager.getTodos().add(
					new ToDo(9, "buy car", 5));
			todoManager.getTodos().add(
					new ToDo(10, "buy dog", 5));
		}
			
		return todoManager;
	}
	
	

}
