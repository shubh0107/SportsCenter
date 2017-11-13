package com.project.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GotoCricketServlet
 */
@WebServlet("/GotoCricketServlet")
public class GotoCricketServlet extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 4037242922679026186L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public GotoCricketServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("WEB-INF/views/cricketView.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
