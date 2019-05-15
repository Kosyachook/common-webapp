package com.kosyachook.webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosyachook.webapp.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private LoginService userValidateService = new LoginService();
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");*/
		
		//req.setAttribute("name", req.getParameter("name"));
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		boolean isValidUser = userValidateService.validateUser(name, password);
		
		if(isValidUser) {
			//req.setAttribute("todos", todoService.getTodos());
			//req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
			req.getSession().setAttribute("name", name );
			resp.sendRedirect("/common-webapp/todo.do");
		}else {
			req.setAttribute("errorMessage", "Invalid Credentials!!" );
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		}
	}
	
}
