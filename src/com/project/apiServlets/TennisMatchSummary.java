package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.api.ApiRequests;

/**
 * Servlet implementation class TennisMatchSummary
 */
@WebServlet("/TennisMatchSummary")
public class TennisMatchSummary extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 3378291051046648514L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public TennisMatchSummary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String matchId = request.getParameter("matchId");
		ApiRequests apiRequest = new ApiRequests();
		String matchSummary = null;
		try {
			matchSummary=apiRequest.tennis_sendRequestMatchSummary(matchId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("output", matchSummary);
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
