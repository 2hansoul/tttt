package com.company.springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mapper.TestMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class DB_Mapper {
	 @Setter(onMethod_ = {@Autowired} )
		private TestMapper testMapper;
	    //private TestMapper testMapper;
	    
	    @Test
	    public void test() {
	    	
	    	log.info("------------------mapper1:"+testMapper);
	    	log.info("------------------mapper2:"+testMapper.getClass().getName());
			log.info("------------------mapper3:"+testMapper.test());  
	    }
}
