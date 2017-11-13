package com.project.util;

public class QueryConstants {
	public static final String INSERT_USER = "INSERT INTO XBBNHFC_USERS VALUES(?,?,?,?,?)";
	public static final String INSERT_SELECTED_SPORT = "INSERT INTO XBBNHFC_SELECTED_SPORT VALUES(?,?,?,?)";
	public static final String UPDATE_USER = "UPDATE XBBNHFC_USERS SET EMAIL=?,PASSWORD=? WHERE EMAIL=?";
	public static final String DELETE_USER= "DELETE FROM XBBNHFC_USERS WHERE EMAIL=?";
	public static final String SELECT_USER = "SELECT * FROM XBBNHFC_USERS WHERE EMAIL=? AND PASSWORD=?";
	public static final String SELECT_USER_BY_ID = "SELECT * FROM XBBNHFC_USERS WHERE EMAIL=?";
	public static final String SELECT_ALL_USER = "SELECT * FROM XBBNHFC_USERS ORDER BY NAME";
	
	public static final String SELECT_SELECTED_SPORT = "SELECT * FROM XBBNHFC_SELECTED_SPORT WHERE EMAIL=?";
	public static final String UPDATE_ADD_CRICKET = "UPDATE XBBNHFC_SELECTED_SPORT SET CRICKET=1 WHERE EMAIL=?";
	public static final String UPDATE_ADD_SOCCER= "UPDATE XBBNHFC_SELECTED_SPORT SET SOCCER=1 WHERE EMAIL=?";
	public static final String UPDATE_ADD_TENNIS = "UPDATE XBBNHFC_SELECTED_SPORT SET TENNIS=1 WHERE EMAIL=?";
	public static final String UPDATE_REMOVE_CRICKET= "UPDATE XBBNHFC_SELECTED_SPORT SET CRICKET=0 WHERE EMAIL=?";
	public static final String UPDATE_REMOVE_SOCCER= "UPDATE XBBNHFC_SELECTED_SPORT SET SOCCER=0 WHERE EMAIL=?";
	public static final String UPDATE_REMOVE_TENNIS= "UPDATE XBBNHFC_SELECTED_SPORT SET TENNIS=0 WHERE EMAIL=?";

}
