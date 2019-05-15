package com.kosyachook.webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	private TodoService todoService = new TodoService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String newItemName = req.getParameter("todo");
		
		if("".equals(newItemName)) {
			req.setAttribute("errorMessage", "Enter a valid todo");
		}else {
			todoService.addItem(new Todo(newItemName));
		}
		resp.sendRedirect("/common-webapp/todo.do");
	}
	
}
