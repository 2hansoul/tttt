<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"  %>	
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
 <body>
<div class="container  panel panel-info">
   <!--   							  -->  
   <!--   							  -->
   <!--   							  -->  
   <!--   							  -->       
   <h3 class="panel-heading">MILKS DETAIL</h3> 
   	<div class="form-group"> 
   		<label for="mname4">우유이름 입력</label>
   		<input type="text" name="mname"   id="mname1"   class="form-control" 
   			   readonly value=""/>
   	</div>	
    <div class="form-group"> 
   		<label for="mprice4">우유값 입력</label>
   		<input type="number" name="mprice"   id="mprice1"   class="form-control"
   				readonly value=""/>
   	</div>	
    <div class="form-group"> 
    	<a href="" class="btn btn-danger">[HOME]</a>
    </div>
            
</div><!-- container END -->   
 </body>
</html>
