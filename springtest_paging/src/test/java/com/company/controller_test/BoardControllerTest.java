package com.company.controller_test;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
          })
@Log4j
public class BoardControllerTest {
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	private MockMvc mocMVc;
	
	@Before
	public void before_test() {
		this.mocMVc=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void list() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);  //model 객체를 전달시 getmodelmap
	}
	
	//글쓰기폼
	@Test
	public void creat_get() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/create"))
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  //view
	}
	
	//글쓰기 기능
	@Test
	public void creat_post() throws Exception{
		log.info(mocMVc.perform(
				MockMvcRequestBuilders.post("/board/create")
				.param("bname", "2").param("bpass", "2").param("btitle", "2").param("bcontent", "content")
				)
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  
	}
	
	@Test
	public void read() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/read").param("bno", "28"))
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  //view
	}
	
	@Test
	public void update_get() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/update").param("bno", "28"))
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  //view
	}
	
	
	
	@Test
	public void update_post() throws Exception{
		log.info(mocMVc.perform(
				      MockMvcRequestBuilders.post("/board/update")
				      .param("bno", "28").param("bpass", "1")
				      .param("btitle", "btitle").param("bcontent", "_bcontent")
				      )
				   .andReturn()
				   .getModelAndView()
				   .getModelMap()
	
				);
	}
	
	
	@Test
	public void delete_get() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/delete").param("bno", "18"))
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  //view
	}
	
	
	@Test
	public void delete_post() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/delete")
				.param("bno", "33")
				.param("bpass", "2")
				)
				.andReturn()
				.getModelAndView()
				.getViewName()
				);  //view
	}
	
	@Test
	public void listPaging() throws Exception{
		log.info(mocMVc.perform(MockMvcRequestBuilders.get("/board/list").param("pstartno", "100"))
				                  .andReturn()
				                  .getModelAndView()
				                  .getModelMap()
				                  ); 
				                          
	}
     
}
