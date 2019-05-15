package com.kosyachook.webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo.do")
public class ListTodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		req.setAttribute("todos", todoService.getTodos());
		req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, resp);
	}

	/*
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newItemName = req.getParameter("todo");
		
		if("".equals(newItemName)) {
			req.setAttribute("errorMessage", "Enter a valid todo");
		}else {
			todoService.addItem(new Todo(newItemName));
		}
		resp.sendRedirect("/common-webapp/todo.do");
		//req.setAttribute("todos", todoService.getTodos());
		//req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, resp);
	}*/

	
}
