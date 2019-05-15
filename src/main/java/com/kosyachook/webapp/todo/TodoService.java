package com.kosyachook.webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Java EE Stack Web Application"));
		todos.add(new Todo("Learn Spring and Spring MVC"));
		todos.add(new Todo("Learn Spring Boot"));
		todos.add(new Todo("Learn ReactJS"));
	}

	public List<Todo> getTodos() {
		return todos;
	}
	
	public void addItem(Todo item) {
		todos.add(item);
	}
	
	public void deleteTodo(String todo) {
		todos.remove(new Todo(todo));
	}
}
