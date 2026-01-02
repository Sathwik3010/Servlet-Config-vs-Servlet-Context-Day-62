package com.codegnan.web;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name="/FirstServlet", urlPatterns= {"/first"},
initParams= {
		@WebInitParam(name="C",value="CCC"),
		@WebInitParam(name="D",value="DDD")
      }
		)
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		out.println("<html><body><h1>");
		out.println("a---------->"+context.getInitParameter("A")+"<br>");
		out.println("b---------->"+context.getInitParameter("B")+"<br>");
		out.println("c---------->"+config.getInitParameter("C")+"<br>");
		out.println("d---------->"+config.getInitParameter("D")+"<br>");
		out.println("e---------->"+config.getInitParameter("E")+"<br>");
		out.println("f---------->"+config.getInitParameter("F")+"<br>");
		out.println("</h1></body></html>");


	}

}
