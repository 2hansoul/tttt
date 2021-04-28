package com.company.mapper;

import java.util.HashMap;
import java.util.List;

import com.company.dto.BoardDto;

public interface BoardMapper {
       public List<BoardDto> list();
       public int create(BoardDto dto);
       public BoardDto  read(BoardDto dto);
       public int update_hit(BoardDto dto);
       public int update(BoardDto dto);
       public int delete(BoardDto dto);
       
       public int listcnt();
       public List<BoardDto> list10(HashMap param);
       //전체 게시판 리스트 출력
       //게시판에 글쓰기 
       //게시판 클릭하면 그 정보 읽어오기
       //게시판 글 수정
       //게시판 글 삭제 비번 입력해서
	
	  //페이징 페이지 총 개수 구하기 select bno from (select rownum rnum, a.* from(select*from
	
//	  mvcboard order by bno desc)a)b where b.rnum bet wnne #{pstartno} and
//	  #{onepagelist};

	
	
}
