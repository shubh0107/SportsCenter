package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.project.api.ApiRequests;

/**
 * Servlet implementation class CricketDailySchdeule
 */
@WebServlet("/CricketDailySchedule")
public class CricketDailySchdeule extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -5914371452230915391L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CricketDailySchdeule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ApiRequests apiRequest= new ApiRequests();	
		String date = request.getParameter("date");
		String month= request.getParameter("month");
		String year = request.getParameter("year");
		if (date==null || month==null || year==null)
		{	
			request.setAttribute("error", "Please mention the date correctly.");
			request.getRequestDispatcher("WEB-INF/views/cricketView.jsp").forward(request, response);
		}
		try {
			apiRequest.cricket_sendRequestDailySchedule(year, month, date);
			//System.out.println(schedule);
			request.setAttribute("output", "1");
			request.setAttribute("showDate", date);
			request.setAttribute("showMonth", month);
			request.setAttribute("showYear", year);
		} catch (Exception e) {
			System.out.println("Exception in cricketDailyScheduleServlet");
			e.printStackTrace();
		}
		
		/*
		UserHandler myHandler = new UserHandler();
		//ApiRequestSax apiRequestSax = new ApiRequestSax();
			try {
				apiRequest.cricket_sendRequestDailySchedule();
				List<Schedule> list = myHandler.getScheduleList();
				//System.out.println(list);
				HttpSession session = request.getSession(true);
				session.setAttribute("scheduleList", list);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
	
		
			*/
			

			request.getRequestDispatcher("WEB-INF/views/cricketView.jsp").forward(request, response);
			//getServletContext().getRequestDispatcher("/WEB-INF/views/cricketView.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
