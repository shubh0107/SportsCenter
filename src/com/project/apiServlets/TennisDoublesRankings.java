package com.project.apiServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TennisDoublesRankings
 */
@WebServlet("/TennisDoublesRankings")
public class TennisDoublesRankings extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 6009698225682473379L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public TennisDoublesRankings() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//String rankings = apiRequest.tennis_sendRequestDoublesRankings();
			//System.out.println(rankings);
			request.setAttribute("toutput", "2");
		} catch (Exception e) {
			System.out.println("Exception in tennisDoublesRankingsServlet");
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
