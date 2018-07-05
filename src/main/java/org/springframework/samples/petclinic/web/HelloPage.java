package org.springframework.samples.petclinic.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 
 *   Example URL:  http://localhost:8080/HelloWorldServlet/HelloPage?urlIntValue=5
 *
 */

@WebServlet("/HelloPage")

public class HelloPage extends HttpServlet {

	public HelloPage() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter printWriter = response.getWriter();

		int parameterInt = Integer.parseInt(request.getParameter("urlIntValue"));
		printWriter.println("<h1>Sleeping for </h1>" + parameterInt + " ms");
		try {
			Thread.sleep(parameterInt);
		}

		catch (Exception e) {
		}
	}
}

