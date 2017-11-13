package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.api.ApiRequests;

/**
 * Servlet implementation class SoccerTournamentInfo
 */
@WebServlet("/SoccerTournamentInfo")
public class SoccerTournamentInfo extends HttpServlet {
       
	/**
	 * 
	 */
	private static final long serialVersionUID = 1690676048622930078L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SoccerTournamentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tournamentId = request.getParameter("tournamentId");
		ApiRequests apiRequest = new ApiRequests();
		String tournamentInfo = null;
		try {
			tournamentInfo =apiRequest.soccer_RequestTournamentInfo(tournamentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("output", tournamentInfo);
		request.getRequestDispatcher("WEB-INF/views/soccerView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
