package com.company.Bservice;

import java.awt.PageAttributes.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.company.dto.BoardDto;
import com.company.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class BoardServiceTest {
	@Setter(onMethod_  = {@Autowired} )
	private BoardService service;
	
	/*
	 * @Test public void list() { log.info("list=========="+service.list()); //전체
	 * 데이터 가져오기 위해서 service.list().forEach(item->log.info(item)); }
	 * 
	 * @Test public void create() { BoardDto dto=new BoardDto(); dto.setBname("2");
	 * dto.setBpass("2"); dto.setBtitle("2");dto.setBcontent("2");
	 * log.info("33333333333"+service.create(dto)); } //
	 * 
	 * @Test public void read() { BoardDto dto=new BoardDto(); dto.setBno(28);
	 * log.info("4-1=========="+service.read(dto));
	 * 
	 * }
	 * 
	 * @Test public void update_view() { BoardDto dto=new BoardDto();
	 * dto.setBno(28); log.info("55555555555555555555"+service.update_view(dto));
	 * 
	 * }
	 * 
	 * @Test public void update() { BoardDto dto=new BoardDto();
	 * dto.setBtitle("1_new");dto.setBcontent("1_new"); dto.setBno(28);
	 * dto.setBpass("2");
	 * 
	 * log.info("6-1=========="+service.update(dto));
	 * log.info("6-2========"+service.update_view(dto)); }
	 * 
	 * @Test public void delete() { BoardDto dto=new BoardDto(); dto.setBno(16);
	 * dto.setBpass("1"); log.info("7-1========="+service.delete(dto));
	 * log.info("7-2========="+service.update_view(dto)); }
	 */
	
	@Test
	public void listcnt() {
		log.info("-----------8"+service.listcnt());
	}
	
	@Test
	public void list10() {
		log.info("9-1"+service.list10(20));
		log.info("------9-2");
		service.list10(20).forEach(item->log.info(item));
	}
	
//	@Test
//	public void create_post() throws Exception{
//		MockMultipartFile file
//		=new MockMultipartFile("file", "001.jpg" , MediaType.TEXT_PLAIN_VALUE,"001.jpg".getBytes());
//		
//		MockHttpServletRequestBuilder builder=
//				MockMvcRequestBuilders.fileUpload("/board/create/")
//				.file(file).param("bname", "2").param("bpass", "2").param("btitle", "2").param("bcontent","2").param("bip", "2").param("bfile", "001.jpg");
//		
//		log.info(mocmv);
//	}
	
	
	
}
