package com.company.springtest;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
public class DB_MYBATIS {
	 @Setter(onMethod_ = {@Autowired })
     private DataSource ds;
     
     @Setter(onMethod_ = {@Autowired} )
     private SqlSessionFactory sqlFactory;
     
     @Test
     public void test() {
     	try {
     	log.info("-------------------MYBATIS1."+sqlFactory);//1.org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@5d28bcd5
     	SqlSession session =sqlFactory.openSession();
     	Connection conn=session.getConnection();
     	log.info("----------------MYBATIS2."+session);//2.org.apache.ibatis.session.defaults.DefaultSqlSession@72be135f
     	log.info("----------------MYBATIS3."+conn);//3.HikariProxyConnection@358420513 wrapping oracle.jdbc.driver.T4CConnection@5dda6f9
     	}catch (Exception e) {
				e.printStackTrace();
			}
     }
}
