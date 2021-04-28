<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %> 
<!--					 -->
<!--  header.html  -->
	<div class="container">
			<h3>QNA 삭제</h3>
			<form action="${pageContext.request.contextPath }/board/delete" method="post"> 			
				<div class="form-group">
				<input type="hidden" id="bno" name="bno" value="${boardDto.bno}"/>
				  <label for="bpass"  >비밀번호</label>
				  <input type="password"   name="bpass"   id="bpass"   class="form-control" > 
				  <span>(*) 수정, 삭제시 필수입니다. </span>
				</div>
				<div class="form-group">
					<input type="submit" value=" 확 인 "  />
					<input type="reset"   onclick="history.go(-1);"  value="취소"  >  
				</div>	
			</form>
	</div>
<!--					 -->
<!--  Footer.html  -->
<!--					 -->
<%@include file="../inc/footer.jsp" %> 