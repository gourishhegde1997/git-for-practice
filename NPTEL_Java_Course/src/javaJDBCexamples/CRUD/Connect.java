package javaJDBCexamples.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	String userName = "";
	String password = "";
	String schema = "";

	public Connection init(String userName, String password, String schema) {
		Connection conn = null;
		try {
			System.out.println("---> Establishing Database connection...");
			this.userName = userName;
			this.password = password;
			this.schema = schema;
			String url = "jdbc:mysql://localhost/"+schema+"?serverTimezone=UTC";
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("---> Database connection is established...!");
//			conn.close();
//			System.out.println("---> Database connection is closed...");
		} catch (Exception e) {
			System.out.println("---> Error occured during establishing connection...");
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		System.out.println("---> Welcome to the JDBC example program...");
		Connect cnt = new Connect();
		cnt.init("root","root","Student_details");
	}

}
