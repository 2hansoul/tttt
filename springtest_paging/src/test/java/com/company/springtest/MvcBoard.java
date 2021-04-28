package com.company.springtest;

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
public class MvcBoard {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper board;
	
	/*
	 * @Test public void boardlist() {
	 * log.info("-----------board리스트 출력되니?"+board.list());
	 * board.list().forEach(board->log.info(board)); }
	 * 
	 * @Test public void boardInsert() { BoardDto dto=new BoardDto();
	 * dto.setBname("aaa"); dto.setBpass("222"); dto.setBtitle("title");
	 * dto.setBcontent("content"); dto.setBdate("date"); dto.setBip("172.111.555");
	 * log.info("----------board에 insert"+board.create(dto)); }
	 * 
	 * @Test public void boardRead() { BoardDto dto=new BoardDto(); dto.setBno(5);
	 * log.info("---------board read에 되니?"+board.read(dto)); }
	 * 
	 * @Test public void update_hit() { BoardDto dto=new BoardDto(); dto.setBno(15);
	 * log.info(board.update_hit(dto)); }
	 * 
	 * @Test public void update() { BoardDto dto=new BoardDto();
	 * dto.setBtitle("update_title"); dto.setBcontent("update_content");
	 * dto.setBno(18); dto.setBpass("222"); log.info(board.update(dto));
	 * log.info(board.list()); }
	 * 
	 * @Test public void delete() { BoardDto dto=new BoardDto(); dto.setBno(10);
	 * dto.setBpass("111"); log.info("board 삭제 되니?"+board.delete(dto)); }
	 */
    
	@Test
	public void listcnt() {
		
		log.info("갯수"+board.listcnt());
	}
	
	
	
	
}
