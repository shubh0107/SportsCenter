package com.project.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.SelectedSportDao;
import com.project.dao.impl.SelectedSportDaoImpl;
import com.project.model.Account;

/**
 * Servlet implementation class AddSportSoccer
 */
@WebServlet("/AddSportSoccer")
public class AddSportSoccer extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -3470169362141346931L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public AddSportSoccer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Account user = (Account) session.getAttribute("userIs");
		System.out.println(user.getEmail());
		
		SelectedSportDao selectedSportDao = new SelectedSportDaoImpl();
		selectedSportDao.updateAddSoccer(user);
		session.setAttribute("isSoccer", "1");
		session.setAttribute("noSoccer", "0");
		
		request.getRequestDispatcher("WEB-INF/views/addRemoveSport.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
