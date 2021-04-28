<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="java.sql.*" %>  

<%@include file="../inc/header.jsp" %> 
<!--					 -->
<!--  header.html  -->
 <script>
 $(function(){
	 var result='${success}'; console.log(result);
     if(result=='fail'){
    	 alert('비번 확인'); history.go(-1);
     }else if(result.length !=0){
    	 alert('${success}');
     }
 });
 
 </script>

	<div class="container  spring2_detail">
			<h3>QNA 상세보기</h3> 			
  			<div class="panel"  >
			  <div  class="panel-heading"><span class="glyphicon glyphicon-plus">  조회수</span></div>
			  <div  class="panel-body">${boardDto.bhit}</div>
			</div>	 
			<div class="form-group"  >
			  <span class="glyphicon glyphicon-plus"><label for="bname">이름</label></span>
			  <input type="text" id="bname"  name="bname" value="${boardDto.bname}"  readonly="readonly" class="form-control" /> 
			</div>				
			<div  class="form-group"   >
			  <span class="glyphicon glyphicon-plus"> <label for="btitle"> 제목</label></span>
			  <input type="text" id="btitle"  name="btitle" value="${boardDto.btitle}"  readonly="readonly" class="form-control" /> 
			</div>	
			<div  class="form-group"   >
			  <span class="glyphicon glyphicon-plus"> <label for="bcontent"> 내용</label></span>
			  <textarea  rows="10" cols="60" name="bcontent"  id="bcontent" class="form-control"  readonly="readonly" >${boardDto.bcontent}</textarea>
			</div>	
           <div  class="form-group"   >
			  <span class="glyphicon glyphicon-plus"> <label for="bcontent"> 사진</label></span>
			   <img src="/upload/${boardDto.bfile}" alt=""/> 
			</div>	
			<div class="row  text-right"    >
				 <a href="${pageContext.request.contextPath}/board/update?bno=${boardDto.bno}"  class="btn" >수정</a> 
				 <a href="${pageContext.request.contextPath}/board/delete?bno=${boardDto.bno}"  class="btn" >삭제</a> 
				 <a href="${pageContext.request.contextPath}/board/list"   class="btn">목록보기</a>  
			</div>	
	</div>

<!--					 -->
<!--  Footer.html  -->
<!--					 -->
<%@include file="../inc/footer.jsp" %> 
