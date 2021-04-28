package com.company.sbasic003_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class DB001_JDBC {
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
		
	}
	

}
/////////@Log4j 에러하면 :log4j 버전올리고 runtime 주석달기
/////////@Test 에러나면   :bulid path-junit4