<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="java.sql.*" %>  

<%@include file="../inc/header.jsp" %> 
<!--					 -->
<!--  header.html  -->


	<div class="container">
			<h3>QNA 수정하기</h3>
			<form action="${pageContext.request.contextPath}/board/update"    method="post"  id="modifyform" enctype="multipart/form-data">
					<!--  bno 숨겨서 넘겨주기  -->		
					<input type="hidden" id="bno" name="bno" value="${boardDto.bno}"/>	
					<div class="form-group"  >
					  <span class="glyphicon glyphicon-plus"><label for="bname">이름</label></span>
					  <input type="text" id="bname"  name="bname" value="${boardDto.bname}"  readonly="readonly" class="form-control" /> 
					</div>	
					<div class="form-group">
					  <label for="bpass"  >비밀번호</label>
					  <input type="password"   name="bpass"   id="bpasss"   class="form-control" > 
					</div>					
					<div  class="form-group"   >
					  <span class="glyphicon glyphicon-plus"> <label for="btitle"> 제목</label></span>
					  <input type="text" id="btitle"  name="btitle" value="${boardDto.btitle}"  class="form-control" /> 
					</div>	
					<div  class="form-group"   >
					  <span class="glyphicon glyphicon-plus"> <label for="bcontent"> 내용</label></span>
					  <textarea rows="10" cols="60" name="bcontent"  id="bcontent" class="form-control" >${boardDto.bcontent}</textarea>
					</div>	
					<div class="form-group">
					  <label for="file"  >파일업로드</label>
					  <input type="file"   name="file"   id="file"   class="form-control" >
					   <input type="text" name="prev_file" id="prev_file" value="${boardDto.bfile}" readonly class="form-control"/>
					</div>	
					<div class="row  text-right"    >
						 <input type="submit"   class="btn"  value="수정"   > 
						 <input type="button"   class="btn"  value="취소"  id="board_cancel"> 
						 <a href="${pageContext.request.contextPath}/board/list"  class="btn" >목록보기</a> 
					</div>	
		</form>	
	</div>
 
 
<!--					 -->
<!--  Footer.html  -->
<!--					 -->
<%@include file="../inc/footer.jsp" %> 
