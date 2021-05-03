package com.semillero.heinsohn.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public static final String url = "jdbc:mysql://localhost:3306/ejerciciosemillero";
	public static final String username = "root";
	public static final String password = "gabriel";
	

	public Connection getConnection() {
		Connection cone = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cone = (Connection) DriverManager.getConnection(url, username, password);
			if (cone != null) {
		    }			
		} catch (Exception e) {
			System.out.println(e);
		}
		return cone;
		

	}
}
