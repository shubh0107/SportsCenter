package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.api.ApiRequests;

/**
 * Servlet implementation class CricketTeamProfile
 */
@WebServlet("/CricketTeamProfile")
public class CricketTeamProfile extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -8142335749014672897L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CricketTeamProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ApiRequests apiRequest = new ApiRequests();
		String teamId = request.getParameter("cricketTeamId");
		System.out.println(teamId);
		try {
			apiRequest.cricket_sendRequestTeamProfile(teamId);
			request.setAttribute("output", "3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
