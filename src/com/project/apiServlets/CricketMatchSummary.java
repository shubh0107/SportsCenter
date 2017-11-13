package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.project.api.ApiRequests;

/**
 * Servlet implementation class CricketMatchSummary
 */
@WebServlet("/CricketMatchSummary")
public class CricketMatchSummary extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -5851851944725060481L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CricketMatchSummary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String matchId = request.getParameter("matchId");
		System.out.println(matchId);
		ApiRequests apiRequest = new ApiRequests();
		
		try {
			apiRequest.cricket_sendRequestMatchSummary(matchId);
		} catch (Exception e) {
			System.out.println("Exception in doGet function of CricketMatchSummary");
			e.printStackTrace();
		}
		request.setAttribute("output", "2");
		request.getRequestDispatcher("WEB-INF/views/cricketView.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
