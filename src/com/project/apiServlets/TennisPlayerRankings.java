package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TennisPlayerRankings
 */
@WebServlet("/TennisPlayerRankings")
public class TennisPlayerRankings extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -1473571506868911890L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public TennisPlayerRankings() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ApiRequests apiRequest= new ApiRequests();	
		try {
			request.setAttribute("toutput", "1");
		} catch (Exception e) {
			System.out.println("Exception in tennisPlayerRankignsServlet");
			e.printStackTrace();
		}
		request.getRequestDispatcher("WEB-INF/views/tennisView.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
