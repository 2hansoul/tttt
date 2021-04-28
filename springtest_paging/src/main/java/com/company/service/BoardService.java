package com.company.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.company.dto.BoardDto;

public interface BoardService {
          public List<BoardDto> list();
          public boolean create(BoardDto dto);
          public BoardDto read(BoardDto dto);  //상세보기 : 조회수올리고+상세보기
          public BoardDto update_view(BoardDto dto);
          public boolean update(BoardDto dto);
          public boolean delete(BoardDto dto);
          
          public int listcnt();
          public List<BoardDto> list10(int pstartno);
          
          //
          public boolean create(BoardDto dto,MultipartFile file,  HttpServletRequest request);
          public boolean update(BoardDto dto,MultipartFile file,  HttpServletRequest request);
}
