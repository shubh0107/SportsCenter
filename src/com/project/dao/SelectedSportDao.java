package com.project.dao;
import java.sql.SQLException;

import com.project.model.Account;
import com.project.model.SelectedSport;

public interface SelectedSportDao {
	public void save(SelectedSport selectedSport) throws SQLException;
	
	public void update(Account email);

	public void remove(String email);

	public SelectedSport get(String email) throws SQLException;
	
	public void updateAddCricket(Account account);
	public void updateAddSoccer(Account account);
	public void updateAddTennis(Account account);
	public void updateRemoveCricket(Account account);
	public void updateRemoveSoccer(Account account);
	public void updateRemoveTennis(Account account);
	

}