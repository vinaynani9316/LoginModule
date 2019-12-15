package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO 
{
	
	String url= "jdbc:mysql://localhost:3306/vinay";
	String sql="select*from login where uname=? and pass=?";
	String username="root";
	String password="password";
	public boolean check(String uname, String pass) 
	{   
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, username,password);
		PreparedStatement st=con.prepareStatement(sql);           //jdbc:mysql://localhost:3306/?user=root
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs=st.executeQuery();
		if(rs.next())
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
