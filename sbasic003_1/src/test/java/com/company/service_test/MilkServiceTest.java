package com.company.service_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dto.MilkDto;
import com.company.service.MilkService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j

public class MilkServiceTest {
      @Setter(onMethod_  = {@Autowired} )
      private MilkService service;
      
      @Test
      public void testService() {
    	  log.info("--------------"+service);
      }
      
      @Test
      public void testList() {
    	  log.info("--------------1:"+service.list());
    	  log.info("---------------1:");
    	  service.list().forEach(milk->log.info(milk));
      }
      
      @Test
      public void testRead() {
    	  MilkDto dto=new MilkDto();
    	  dto.setMno(21); log.info("---------------3:"+service.read(dto));
      }
      
      @Test
      public void testUpdate() {
    	  MilkDto dto=new MilkDto();
    	  dto.setMno(21); dto.setMname("bbb_new2"); dto.setMprice(33333);
    	  log.info("-----------4:"+service.update(dto));
      }
      
      @Test
      public void testDelete() {
    	  MilkDto dto=new MilkDto();
    	  dto.setMno(1);
    	  log.info("----------4:"+service.delete(dto));
    	  service.list().forEach(milk->log.info(milk));;
      }
     
}
