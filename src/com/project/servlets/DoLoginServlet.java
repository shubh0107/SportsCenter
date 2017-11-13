package com.project.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.model.Account;
import com.project.model.SelectedSport;
import com.project.dao.AccountDao;
import com.project.dao.SelectedSportDao;
import com.project.dao.impl.AccountDaoImpl;
import com.project.dao.impl.SelectedSportDaoImpl;

@WebServlet(urlPatterns = { "/doLoginServlet" })
public class DoLoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5014280869113101666L;

	public DoLoginServlet() {
		super();

	}

	private AccountDao accountDao = new AccountDaoImpl();
	private SelectedSportDao selectedSportDao = new SelectedSportDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String email = request.getParameter("user_email");
		String pass = request.getParameter("user_password");

		/*
		 * if (email.equals("admin@gmail.com") && pass.equals("admin")) {
		 * request.setAttribute("user", "Admin");
		 * request.getRequestDispatcher("home.jsp").forward(request, response);
		 * } else { request.setAttribute("error",
		 * "Unknown login, please try again.");
		 * request.getRequestDispatcher("index.jsp").forward(request, response);
		 * }
		 */

		Account user = null;
		boolean hasError = false;
		String errorString = null;
		SelectedSport userSports = null;

		if (email == null || pass == null || email.length() == 0 || pass.length() == 0) {
			hasError = true;
			errorString = "Required username and password!";
		} else {

			user = accountDao.findUser(email, pass);
			if (user == null) {
				hasError = true;
				errorString = "User Name or password invalid";
			}

		}

		if (hasError) {
			user = new Account();
			user.setEmail(email);
			user.setPassword(pass);

			// Store information in request attribute, before forward.
			request.setAttribute("errorString", errorString);
			request.setAttribute("userEmail", email);

			// Forward to /WEB-INF/views/loginView.jsp
			getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp").forward(request, response);
		}

		
		else {
			System.out.println("in else now ");

			try {
				userSports = selectedSportDao.get(email);

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in get() method of selectedSportDao");
			}


			HttpSession session = request.getSession(true);
			System.out.println("Session made.\n");

			session.setAttribute("userIs", user);
			System.out.println("User attribute set.\n");

			if (userSports.getCricket() == 1) {
				System.out.println("isCricket attribute set.\n");
				session.setAttribute("isCricket", "1");
			}
			else {
				System.out.println("noCricket attribute set.\n");
				session.setAttribute("noCricket", "1");
			}

	

			if (userSports.getFootball() == 1) {
				System.out.println("isSoccer attribute set.\n");
				session.setAttribute("isSoccer", "1");
			}
			else {
				System.out.println("noSoccer attribute set.\n");
				session.setAttribute("noSoccer", "1");
			}
			
			

			if (userSports.getTennis() == 1) {
				System.out.println("isTennis attribute set.\n");
				session.setAttribute("isTennis", "1");
			}
			else {
				System.out.println("noTennis attribute set.\n");
				session.setAttribute("noTennis", "1");
			}
			
			System.out.println("Reached end \n");
			
			
			
			try {
				System.out.println("will call sendGet now. \n");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
