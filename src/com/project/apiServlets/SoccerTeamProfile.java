package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.api.ApiRequests;

/**
 * Servlet implementation class SoccerTeamProfile
 */
@WebServlet("/SoccerTeamProfile")
public class SoccerTeamProfile extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 3622632662056089066L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public SoccerTeamProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String matchId = request.getParameter("teamID");
		ApiRequests apiRequest = new ApiRequests();
		String teamProfile = null;
		try {
			teamProfile = apiRequest.soccer_RequestMatchSummary(matchId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("output", teamProfile);
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
