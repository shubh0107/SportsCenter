package com.project.servlets;

import java.io.IOException;
//import java.util.Date;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.AccountDao;
import com.project.dao.SelectedSportDao;
import com.project.dao.impl.AccountDaoImpl;
import com.project.dao.impl.SelectedSportDaoImpl;
import com.project.model.Account;
import com.project.model.SelectedSport;

/**
 * Servlet implementation class DoSignUpServlet
 */

@WebServlet(urlPatterns = {"/doSignUpServlet"})
public class DoSignUpServlet extends HttpServlet {
	
  	/**
	 * 
	 */
	private static final long serialVersionUID = 9042494905523079820L;
	private AccountDao accountDao = new AccountDaoImpl();
	private SelectedSportDao selectedSport = new SelectedSportDaoImpl();
	
   
    public DoSignUpServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html;charset=UTF-8");

		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String pass = request.getParameter("user_password");
		String gender = request.getParameter("user_gender");
		String dob = request.getParameter("dob").toString();
		
		Account newAccount = new Account(name, email, gender, pass, dob);
		System.out.println("newAccount object made.");
		String errorString = null;
		
		
		int cricket_sel=0, football_sel=0, tennis_sel=0;
		
		if(request.getParameter("tennis_selected") == null && 
				request.getParameter("cricket_selected") == null && 
				request.getParameter("football_selected") == null)
		{
			errorString = "Please select atleast one sport";
		}
		
		else{
		
		if(request.getParameter("cricket_selected")!=null)
		{
			cricket_sel = 1;
			
		}
		
		if(request.getParameter("football_selected")!=null)
		{
			football_sel = 1;
		}
		
		if(request.getParameter("tennis_selected")!=null)
		{
			tennis_sel = 1;
		}
		
	}
		
		SelectedSport selectedSport1 = new SelectedSport(email, cricket_sel, football_sel, tennis_sel);
		System.out.println("selectedSport1 object made.");
		
		
		if (errorString == null) {
			try {
				accountDao.save(newAccount);
				System.out.println("Account saved in USERS database.");
				selectedSport.save(selectedSport1);
				System.out.println("Account saved in SPORTS database.");
				
				HttpSession session = request.getSession(true);
				session.setAttribute("userIs", newAccount);
				
				if(selectedSport1.getCricket() == 1)
				{
					session.setAttribute("isCricket", "1");
				}
				else session.setAttribute("noCricket", "1");
				
				if(selectedSport1.getFootball() == 1)
				{
					session.setAttribute("isSoccer", "1");
				}
				else session.setAttribute("noSoccer", "1");
				
				if(selectedSport1.getTennis() == 1)
				{
					session.setAttribute("isTennis", "1");
				}
				else session.setAttribute("noTennis", "1");
				
				System.out.println("Redirection to Home page.");
				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
				dispatcher.forward(request, response);
			
			}catch(SQLIntegrityConstraintViolationException e)

                {
					String error = "Account with this email already exists";
                    request.setAttribute("errorString",error);
                    System.out.println("Exception in doSignUp "+e);
                    request.setAttribute("user", newAccount);
                    request.getRequestDispatcher("/WEB-INF/views/signup.jsp").include(request,response);
               
                }catch (SQLException e) {
				e.printStackTrace();
			
			}
		}

	else

	{
		request.setAttribute("errorString", errorString);
		request.setAttribute("user", newAccount);
			
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/signup.jsp");
			dispatcher.forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
