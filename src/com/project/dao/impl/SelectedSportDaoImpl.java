package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.project.dao.SelectedSportDao;
import com.project.model.Account;
import com.project.model.SelectedSport;
import com.project.util.ConnectionFactory;
import com.project.util.DbUtil;
import com.project.util.QueryConstants;


public class SelectedSportDaoImpl implements SelectedSportDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatment;

	public SelectedSportDaoImpl() {
	}

	public void save(SelectedSport selectedSport) {

		
		
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.INSERT_SELECTED_SPORT);;
			
			preparedStatment.setString(1, selectedSport.getEmail());
			preparedStatment.setInt(2, selectedSport.getCricket());
			preparedStatment.setInt(3, selectedSport.getFootball());
			preparedStatment.setInt(4, selectedSport.getTennis());
			
			// Execute statement.
			preparedStatment.execute();
			System.out.println("Selected Sport Record Saved successfully");
		
		} catch (SQLException e){
			System.out.println("SQLException in save() method");
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Rollback Exception in save() method");
				e1.printStackTrace();
			}
		}
		
	  finally {
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}

	}

	
	public SelectedSport get(String email){

		
		ResultSet rs = null;
		SelectedSport selectedSport = null;
		
		
		try {
			
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);
			
			preparedStatment = connection.prepareStatement(QueryConstants.SELECT_SELECTED_SPORT);
			preparedStatment.setString(1, email);
			
			rs = preparedStatment.executeQuery();
			
			
				
			if (rs.next()) {
				selectedSport= new SelectedSport();
				selectedSport.setEmail(rs.getString(1));
				selectedSport.setCricket(rs.getInt(2));
				selectedSport.setFootball(rs.getInt(3));
				selectedSport.setTennis(rs.getInt(4));
				
			}
		}
			
			catch (SQLException e) {
				System.out.println("SQLException in get() method of SelectedSportsDaoImpl");
				e.printStackTrace();
		
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		return selectedSport;
	}

	public void updateAddCricket(Account account) {
		
		String email = account.getEmail();
		
		
		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_ADD_CRICKET);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateAddCricket() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		
	}

	public void updateAddSoccer(Account account) {

		String email = account.getEmail();
		

		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_ADD_SOCCER);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateAddSoccer() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

	}

	public void updateAddTennis(Account account) {

		String email = account.getEmail();
		

		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_ADD_TENNIS);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateAddTennis() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

	}
	
	public void updateRemoveCricket(Account account) {

		String email = account.getEmail();
		
		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_REMOVE_CRICKET);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateRemoveCricket() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

	}
	
	public void updateRemoveSoccer(Account account) {

		String email = account.getEmail();
		

		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_REMOVE_SOCCER);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateRemoveSoccer() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

	}
	public void updateRemoveTennis(Account account) {

		String email = account.getEmail();
		

		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.UPDATE_REMOVE_TENNIS);
			preparedStatment.setString(1, email);
			preparedStatment.executeUpdate();
		}

		catch (SQLException e) {
			System.out.println("SQLException in updateRemoveTennis() method of SelectedSportsDaoImpl");
			e.printStackTrace();

		} finally {
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

	}

	@Override
	public void update(Account email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String email) {
		// TODO Auto-generated method stub
		
	}


}