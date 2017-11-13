package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CREATE TABLE GD_ACCOUNT(ACC_NO NUMBER(4)PRIMARY KEY, ACC_NAME VARCHAR2(20), ACC_TYPE VARCHAR2(20), BAL NUMBER(10,2));

public class ConnectionFactory {
	// static reference to itself
	private static ConnectionFactory instance = new ConnectionFactory();
	/*
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER = "sys as sysdba";
	public static final String PASSWORD = "oraclexe";
	*/
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@10.232.71.29:1521:INATP02";
	public static final String USER = "shobana";
	public static final String PASSWORD = "shobana";
	
	// private constructor
	
	private ConnectionFactory() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
			e.printStackTrace();
		}
		return connection;
	}

	public static Connection getConnection() {
		return instance.createConnection();
	}
}
