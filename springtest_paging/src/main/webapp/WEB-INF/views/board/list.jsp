<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false"%>

<%@include file="../inc/header33.jsp" %> 
<script>
$(function(){
	var result='${success}';
	console.log(result);
	if(result.length !=0){
		alert('${success}');
	}
});
</script>

<!-- Main content -->
<section class="container"  style="margin-top:10%">
	<table class="table table-striped table-hover">
	<caption>multi board</caption>
		<thead>
			<tr>
				<th scope="col">BNO</th>
				<th scope="col">TITLE</th>
				<th scope="col">WRITER</th>
				<th scope="col">DATE</th>
				<th scope="col">HIT</th>
			</tr>
		</thead>
		<tbody>
         <c:set var="total" value="${list.size()}"/>
         <c:forEach var="dto" items="${list}" varStatus="status">
         <tr>
         <td>${paging.listtotal - status.index - paging.pstartno }</td>
         <td><a href="${pageContext.request.contextPath}/board/read?bno=${dto.bno}">${dto.btitle}</a></td>
         <td>${dto.bname}</td>
         <td>${dto.bdate}</td>
         <td>${dto.bhit}</td>
         </tr>
         
         </c:forEach>
		</tbody>
		<tfoot>
		<tr class="text-center">
		<td colspan="5">
		<ul class="pagination">
		<li><a href="#">이전</a>
		<c:if test="${paging.start >=paging.bottomlist}">
		
		<li><a href="${pageContext.request.contextPath}/board/list?pstartno=${(paging.start-2)*paging.onepagelist}">이전</a></li>
		</c:if>
		
		<c:forEach begin="${paging.start}" end="${paging.end}" var="i">
		<li <c:if test="${paging.current==i}"> class="active" </c:if>>
		<a href="${pageContext.request.contextPath}/board/list?pstartno=${(i-1)*paging.onepagelist}">${i}</a></li>
		</c:forEach>	
			
		<c:if test="${paging.pagetotal > paging.end}">
		<li><a href="${pageContext.request.contextPath}/board/list?pstartno=${paging.end*paging.onepagelist}">다음</a></li>
		</c:if>	
		
		</ul>
		</td>
		</tr>
		
			<tr  class="text-center">
				<td  colspan="5">
					<a href="${pageContext.request.contextPath}/board/create" class="btn btn-default"> 글쓰기</a>
				</td>
			</tr>	
					
	</table>
</section>


<%@include file="../inc/footer.jsp" %> 
