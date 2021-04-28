package com.company.sbasic003_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dto.MilkDto;
import com.company.mapper.MilkMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class Test005_milkMapper {

    @Setter(onMethod_ = @Autowired)
    private MilkMapper milkMapper;
    
	
	  @Test public void testList() { //전체 출력
	  log.info("-----------test1:"+milkMapper.list()); log.
	  info("-----------test2: MIlkList리스트대상.froEach(milk->log.info(현재index가 가리키는거)"
	  ); milkMapper.list().forEach(milk->log.info(milk));
	  
	  }
	 
    
    @Test
    public void testInsert() {
    	//우유삽입
    	//리턴값 int  /파리미터:MilkDto
    	MilkDto dto=new MilkDto();
    	dto.setMname("test"); dto.setMprice(2331);
    	log.info(milkMapper.create(dto));
    	milkMapper.list().forEach(milk->log.info(milk));
    }
    
    @Test
    public void testRead() {
    	//우유번호 입력받아서 정보확인
    	//리턴값 MilkDto   /파라미터:MilkDto
    	MilkDto dto=new MilkDto();
    	dto.setMno(21);
    	log.info(milkMapper.read(dto));
    }

    @Test
    public void testUpdata() {
    	//우유번호 입력받아서 정보업데이트
    	//리턴값 int    /파리미터:MilkDto
    	MilkDto dto=new MilkDto();
    	dto.setMname("update.milk"); dto.setMprice(1234);
    	dto.setMno(21);
    	log.info(milkMapper.update(dto));
    	
    }
    
    @Test
    public void testDelete() {
    	// 해당 우유번호의 우유삭제
    	//리턴값 int /파라미터 MilkDto
       MilkDto dto=new MilkDto();
       dto.setMno(7);
       log.info(milkMapper.delete(dto));
       milkMapper.list().forEach(milk->log.info(milk));
    }
}
