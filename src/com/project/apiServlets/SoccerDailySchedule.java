package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.api.ApiRequests;

/**
 * Servlet implementation class SoccerDailySchedule
 */
@WebServlet("/SoccerDailySchedule")
public class SoccerDailySchedule extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7582411219876559396L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SoccerDailySchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApiRequests apiRequest= new ApiRequests();	
		try {
			String schedule = apiRequest.soccer_RequestDailySchedule();
			System.out.println(schedule);
			request.setAttribute("output", schedule);
		} catch (Exception e) {
			System.out.println("Exception in soccerDailyScheduleServlet");
			e.printStackTrace();
		}
		
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
