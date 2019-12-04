package javaJDBCexamples.CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Insert {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String tabaleName = "";

	public void insertRow(Connection conn, String tableName, List<String> data) {
		try {
			this.conn = conn;
			this.tabaleName = tableName;
			System.out.println("---> Executing INSERT operation for table : "+tableName);

			String valuesList = "";
			for(String ele : data){
				valuesList = valuesList+"'"+ele+"'"+",";
			}
			valuesList = valuesList.substring(0,valuesList.lastIndexOf(","));
			
			stmt = conn.createStatement();
			String query = "insert into " + tableName + " values(" + valuesList + ");";
			System.out.println("---> Query to be executed is,");
			System.out.println(query);
			stmt.execute(query);
			System.out.println("---> INSERT operation successful...");
		} catch (SQLException ex) {
			System.out.println("---> INSERT operation unsuccessful...!");
			System.out.println("---> SQL Exception: " + ex.getMessage());
			System.out.println("---> SQL State: " + ex.getSQLState());
			System.out.println("---> SQL Vendor error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connect ct = new Connect();
		Insert insrt = new Insert();
		
		List<String> data = new ArrayList<String>();
		data.add("02");
		data.add("Sunil Desai");
		data.add("PME");
		data.add("8951119790");
		
		Connection cnn = ct.init("root", "root", "student_details");
		insrt.insertRow(cnn, "Student_table", data);
		
	}

}
