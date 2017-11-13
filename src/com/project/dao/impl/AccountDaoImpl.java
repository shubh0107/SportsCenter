package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.model.Account;
import com.project.dao.AccountDao;
import com.project.util.ConnectionFactory;
import com.project.util.DbUtil;
import com.project.util.QueryConstants;


public class AccountDaoImpl implements AccountDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatment;

	public AccountDaoImpl() {
	}

	public void save(Account account) throws SQLException {

		//String query = "INSERT INTO XBBNHFC_USERS VALUES(?,?,?,?)";
		
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(QueryConstants.INSERT_USER);;
			
			preparedStatment.setString(1, account.getName());
			preparedStatment.setString(2, account.getEmail());
			preparedStatment.setString(3, account.getGender());
			preparedStatment.setString(4, account.getPassword());
			preparedStatment.setString(5, account.getDob());

			// Execute statement.
			preparedStatment.execute();
			System.out.println("Record Saved successfully");
		
		
			
		}
		
	  finally {
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}

	}

	public Account get(String email) throws SQLException {

		String query = "SELECT * FROM XBBNHFC_USERS WHERE EMAIL='" + email + "'";
		ResultSet rs = null;
		Account account = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				account = new Account();
				account.setName(rs.getString(1));
				account.setEmail(rs.getString(2));
				account.setGender(rs.getString(3));
				account.setPassword(rs.getString(4));
				account.setDob(rs.getString(5));
			}

		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		return account;
	}
	
	public Account findUser(String userId, String userPass) {

		ResultSet rs = null;
		Account found = null;

		try {
			connection = ConnectionFactory.getConnection();
			preparedStatment = connection.prepareStatement(QueryConstants.SELECT_USER);
			preparedStatment.setString(1, userId);
			preparedStatment.setString(2, userPass);
			rs = preparedStatment.executeQuery();
			if (rs.next()) {
				found = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("SQLException in findUser() method");
			e.printStackTrace();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
		return found;
	}
	
	
	public Account findUser(String userId) {

		ResultSet rs = null;
		Account found = null;

		try {
			connection = ConnectionFactory.getConnection();
			preparedStatment = connection.prepareStatement(QueryConstants.SELECT_USER_BY_ID);
			preparedStatment.setString(1, userId.toUpperCase());
			rs = preparedStatment.executeQuery();
			if (rs.next()) {
				found = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("SQLException in get() method");
			e.printStackTrace();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
		return found;
	}
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(String email) {
		// TODO Auto-generated method stub
		
	}

	

}