package com.fanniemae.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAccountConnection {

	static Connection conn1 = null;
	public PreparedStatement ps2,ps3; 
	public ResultSet rs1;
	
	public static Connection getMySQLConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection("jdbc:mysql://localhost/sdet5", "root", "Hexaware!");
			conn1.setAutoCommit(true);
			return conn1;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
