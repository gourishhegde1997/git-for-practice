package javaJDBCexamples.CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Create {

	Statement stmt = null;
	ResultSet rs = null;
	Connection conn = null;
	String tableName = "";
	static List<String> arguments = new ArrayList<>();

	public void create_table(Connection conn, String tableName, List<String> cols) {
		try {
			this.conn = conn;
			this.tableName = tableName;
			
			System.out.println("---> Executing CREATE opertion for table name : "+tableName);
			String args = "";
			for(String ele : cols){
//				System.out.println(ele);
				args = args+ele+",";
			}		
			System.out.println(args);
			String finalArgs = args.substring(0,args.lastIndexOf(","));
//			System.out.println("---> "+finalArgs);
			stmt = conn.createStatement();
			String query = "create table "+ tableName +"("+finalArgs+");";
			System.out.println("---> Query to be executed is:");
			System.out.println(query);
			stmt.execute(query);
			System.out.println("---> "+ tableName + " Table is created...");
			conn.close();
			
		} catch (SQLException ex) {
			System.out.println("---> "+ tableName + " Table creation unsuccessful...!");
			System.out.println("---> SQL Exception: " + ex.getMessage());
			System.out.println("---> SQL State: " + ex.getSQLState());
			System.out.println("---> SQL Vendor error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connect cnt = new Connect();
		Create ct = new Create();
		
		Connection conn = cnt.init("root", "root", "Student_details");
		arguments.add("student_id varchar(3) primary key");
		arguments.add("student_name varchar(15) not null");
		arguments.add("combination char(4)");
		arguments.add("contact_no bigint(10)");
		ct.create_table(conn, "Student_table",arguments);
		
	}

}
