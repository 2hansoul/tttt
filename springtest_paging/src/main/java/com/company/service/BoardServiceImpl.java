package com.company.service;



import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.company.dto.BoardDto;
import com.company.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class BoardServiceImpl implements BoardService{
	@Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

	@Override
	//전체페이지
	public List<BoardDto> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	@Override
	//글쓰기
	public boolean create(BoardDto dto) { 
		try {
			//bip는 직접적으로 받는게 아니기 때문에 따로 설정을 해줘야한다
			dto.setBip(InetAddress.getLocalHost().getHostName());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		return mapper.create(dto)==1;
	}

	@Override
	//상세보기
	public BoardDto read(BoardDto dto) { 
		mapper.update_hit(dto);
		return mapper.read(dto);
	}

	@Override
	//수정하기 페이지
	public  BoardDto update_view(BoardDto dto) {
		// TODO Auto-generated method stub
		return mapper.read(dto);
	}

	@Override
	//수정하기 기능
	public boolean update(BoardDto dto) {
		// TODO Auto-generated method stub
		return mapper.update(dto)==1;
	}

	@Override
	//삭제 하기 기능
	public boolean delete(BoardDto dto) {
		// TODO Auto-generated method stub
		return mapper.delete(dto)==1;
	}

	@Override
	public int listcnt() {
		// TODO Auto-generated method stub
		return mapper.listcnt();
	}

	@Override
	public List<BoardDto> list10(int pstartno) {
		HashMap<String, Integer> param=new HashMap<>();
		param.put("pstartno", pstartno);
		param.put("onepagelist", pstartno+10);
		return mapper.list10(param);
	}

	@Override
	public boolean create(BoardDto dto, MultipartFile file, HttpServletRequest request) {
		log.info("--------------1 insert"+file.getOriginalFilename());
		try {
			dto.setBip(InetAddress.getLocalHost().getHostName());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			dto.setBfile( fileUpload(file.getOriginalFilename(),request,file.getBytes()));
		}catch (IOException e) {
		e.printStackTrace();
		}
		return mapper.create(dto)==1;
	}

	@Override
	public boolean update(BoardDto dto, MultipartFile file, HttpServletRequest request) {
		log.info("-------------1 update:"+file.getOriginalFilename());
		dto.setBfile(request.getParameter("prev_file"));
		
		if(file.getOriginalFilename().length() !=0) {
			try {
				dto.setBfile( fileUpload(file.getOriginalFilename(),request,file.getBytes()));
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		return mapper.update(dto)==1;
	}
	public String fileUpload(String orginName,HttpServletRequest request,byte [] fileData) throws IOException {
		
		
	  	  String saveName= UUID.randomUUID().toString() +"-"+orginName;
	  	  //2. 파일 업로드
	  	  String path="/upload"; //연습용 (서버등록 확인)
	  	  //path = request.getSession().getServletContext().getRealPath("/") +path;  //호스팅 할때 쓸거
	  	
	  	  
	  	  File target=new File(path, saveName);
	  	  FileCopyUtils.copy(fileData, target);
	  	
	  	  return saveName;
			
		}
	
	
	

	
         
         
}
