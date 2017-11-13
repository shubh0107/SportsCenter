package com.project.dao;
import java.sql.SQLException;

import com.project.model.Account;


public interface AccountDao {
	public void save(Account newAccount) throws SQLException;
	
	public void update(Account email);

	public void remove(String email);

	public Account get(String email) throws SQLException;

	public Account findUser(String email, String pass);

}