package com.javaonweb.userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String language = request.getParameter("language");
        String town = request.getParameter("town");
		response.setContentType("text/html");
        // writes the response
        PrintWriter out = response.getWriter();
        if (first_name == null && last_name == null)
        	out.write("<h1> Hello Unknown, Uknown </h1>");
        else
        	out.write("<h1>Hello " + first_name + ", " + last_name + "</h1>");
        
        if(language == null)
        	out.write("<h2> Your favorite language is: Unknown");
        else
        	out.write("<h2> Your Favorite language is: " + language);
        if(town == null)
        	out.write("<h3> Your home town is: Unknown");
        else
        	out.write("<h3> Your home town is: " + town);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
