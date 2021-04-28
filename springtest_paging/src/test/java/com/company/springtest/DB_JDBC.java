package com.company.springtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
@Log4j
public class DB_JDBC {
	@Test
	public void test() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ouser","1111");
		     log.info("----------------jdbc연동성공"+conn);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); Connection
		 * conn=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/user?useSSL=false","root","1234"); if(conn
		 * !=null) { log.info("---------------1"+conn); } }catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 */
	}//test
}
