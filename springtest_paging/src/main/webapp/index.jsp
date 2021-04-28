<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 1-3 Mapper 작성후 테스트하기
페이징시 전체 글의 갯수 이전 [1,2,3,4,5,6,7,8,9,10,11] 다음    Math.cell(128/(float)10)=13
select count(*) from mvcboard

orcale -rownum 이용해서 최신글을 기준으로 1~10개 사이의 데이터 가져오기
1.정렬
2.rownum 갯수 이용해서 1~10개 사이의 데이터 가져오기
3.rownum 갯수 이용해서 11~20개 사이의 데이터 가져오기

select rownum, a* from mvcboard a order by bno desc where rownum >=1 and rownum <=10;

select bno from (select rownum rnum,a.* from(select*from mvcboard order by bno desc)a)b
where b.rnum between 11 and 20;

1-4 mapper 작성후 테스트하기
1.com.company.mapper -boardmapper
2.com.compnay.mapper-boardmapper.xml -->


<div class="container panel panel-info">
<h3 class="panel-heading">board</h3>
<%response.sendRedirect(request.getContextPath()+"/board/list"); %>
</div>


</body>

</html>
   