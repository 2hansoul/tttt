package com.company.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.dto.BoardDto;
import com.company.dto.PagingDto;
import com.company.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
   //servlet-context 컨트롤러 넣어줘야함
   
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@RequestMapping(value="/create" ,method=RequestMethod.GET)
	public void create_get() {
		log.info("---------get:/board/create");
	}
	
	/*
	 * @RequestMapping(value="/create" ,method=RequestMethod.POST) public String
	 * create_post(BoardDto dto,RedirectAttributes rttr) {
	 * log.info("-----------post:/board/create"); String result="";
	 * if(service.create(dto)) { result="글쓰기 성공"; }
	 * rttr.addFlashAttribute("success", result); return "redirect:/board/list";
	 * 
	 * }
	 */
	@RequestMapping(value="/create" ,method=RequestMethod.POST)
	public String create_post(MultipartFile file,HttpServletRequest request,BoardDto dto,RedirectAttributes rttr) {
		log.info("-----------post:/board/create");
		String result="fail";
		if(service.create(dto,file,request)) {
			result="글쓰기 성공";
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/board/list";
		
	}
	
	@RequestMapping(value="/list" ,method=RequestMethod.GET)
	public void list_get(@RequestParam(value="pstartno",defaultValue = "0")int pstartno,Model model) {
		
		model.addAttribute("list",service.list10(pstartno));
		model.addAttribute("paging" , new PagingDto(pstartno,service.listcnt()));
		log.info("---------get:/board/list");
	}
	
	@RequestMapping(value="/read" ,method=RequestMethod.GET)
	public void read_get(BoardDto dto,Model model) {
		model.addAttribute(service.read(dto));
		log.info("---------get:/board/list");
	}
	
	@RequestMapping(value="/update" ,method=RequestMethod.GET)
	public void update_get(BoardDto dto,Model model) {
		model.addAttribute(service.update_view(dto));
		log.info("---------get:/board/update");
	}
	
	/*
	 * @RequestMapping(value="/update" ,method=RequestMethod.POST) public String
	 * update_post(BoardDto dto,RedirectAttributes rttr) {
	 * 
	 * String result=""; if(service.update(dto)) { result="글 수정 성공"; }else {
	 * result="글 수정 실패"; } rttr.addFlashAttribute("success1", result);
	 * log.info("---------post:/board/update"); return
	 * "redirect:/board/read?bno="+dto.getBno();
	 * 
	 * }
	 */
	
	@RequestMapping(value="/update" ,method=RequestMethod.POST)
	public String update_post(MultipartFile file,HttpServletRequest request,BoardDto dto,RedirectAttributes rttr) {
		
		String result="fail";
		if(service.update(dto,file,request)) {
			result="글 수정 성공";			
		}
		rttr.addFlashAttribute("success", result);
		log.info("---------post:/board/update");
		return "redirect:/board/read?bno="+dto.getBno();
		
	}
	
	@RequestMapping(value="/delete" ,method=RequestMethod.GET)
	public void delete_get(BoardDto dto) {
		
		log.info("---------get:/board/delete");
	}
	
	@RequestMapping(value="/delete" ,method=RequestMethod.POST)
	public String delete_post(BoardDto dto,RedirectAttributes rttr) {
		String result="비빌번호 확인 해주세요";
		if(service.delete(dto)) {
			result="글 삭제 성공";
		}
		rttr.addFlashAttribute("success" ,result);
		
		log.info("---------get:/board/list");
	     return "redirect:/board/list";
	}
	
}
