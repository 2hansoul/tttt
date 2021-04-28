package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.dto.MilkDto;
import com.company.service.MilkService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/milk/*")
@Log4j
public class MilkController {
    @Setter(onMethod_  = {@Autowired} )
	private MilkService service;
	
    @RequestMapping("/list")public void List(Model model) { 
    	log.info("------------------1.get list"); model.addAttribute("list",service.list());
    	}
    
    @PostMapping("/insert")public String insert(MilkDto dto) {
    	log.info("------------------2.post insert");  
    	String result ="글쓰기 실패";
    	if(service.create(dto)) {
    		result="글쓰기 성공";
    	}
    	return "milk/list";
    	}
    @GetMapping("/select")public String select(MilkDto dto,Model model) {
    	log.info("------------------3.get insert"); 
    	model.addAttribute(service.read(dto));
    	return "milk.detail";
    }
    @PostMapping("/update")public String update(MilkDto dto,Model model) {
    	String result="글 수정 실패";
    	log.info("------------------4.post list");
    	if(service.update(dto)) {
    		result="글쓰기 성공";
    	}
    	return "milk.list";
    	}
    @PostMapping("/delete")public String delete(MilkDto dto,Model model) {
    	String result="글삭제 실패";
    	log.info("------------------5.post list"); 
    	if(service.delete(dto)) {
    		result="글삭제 성공";
    	}
    	return "milk.list";
    	}
}
