package com.company.springtest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dto.BoardDto;
import com.company.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class DB005_BoardMapper2_paging {
        @Setter(onMethod_ = {@Autowired})
        private BoardMapper boardMapper;
        
        @Test
        public void list() {
        	boardMapper.list().forEach(list->log.info(list));
        }
        @Test
        public void listscnt() {
        	log.info("-------------1"+boardMapper.listcnt());
        }
        
        @Test
        public void list10() {
        	HashMap<String, Integer> param=new HashMap<>();
        	param.put("pstartno",11);
        	param.put("onepagelist",20);
        	log.info(boardMapper.list10(param));
        }
        
        
        ///////////////////////////////
     
    	
    	@Test
    	public void insert() throws UnknownHostException{
    		BoardDto dto=new BoardDto();
    		dto.setBname("1"); dto.setBpass("1");
    		dto.setBtitle("1"); dto.setBcontent("1");
    		dto.setBip(InetAddress.getLocalHost().getHostName());
    		dto.setBfile("no.jpg");
    		log.info(boardMapper.create(dto));
    	}
        
        @Test
        public void test_update() {
        	BoardDto dto=new BoardDto();
        	dto.setBtitle("1_up"); dto.setBcontent("1_up");
        	dto.setBno(200); dto.setBpass("1"); dto.setBfile("002.jpg");
            log.info(boardMapper.update(dto));
            log.info(boardMapper.list());
        
        
        }
}
