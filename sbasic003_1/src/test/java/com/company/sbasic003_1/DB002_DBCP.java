package com.company.sbasic003_1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class DB002_DBCP {
	@Setter(onMethod_= {@Autowired})
	private DataSource ds;
	
	@Test
	public void test() {
	try {
		Connection conn=ds.getConnection();
		log.info("----------------------DBCP 테스트확인:"+conn);
	}catch (SQLException e) {
		e.printStackTrace();
	}

}
}
