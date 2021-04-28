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
   
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   	<table class="table table-striped table-hover">
		<thead><tr><th scope="col">MNO</th><th scope="col">MNAME</th><th scope="col">MPRICE</th></tr></thead>
		<tbody>
 	     
		</tbody>
	</table>
		
   <h3 class="panel-heading">1) MILKS NEW  : 새로운 우유를 입력해주세요</h3> 
   <form method="post" action=""  id="milkInsert">  	  
   	  <fieldset> 
   	  <legend>우유입력폼</legend>
	   	<div class="form-group"> 
	   		<label for="mname4">우유이름 입력</label>
	   		<input type="text" name="mname"   id="mname1"   class="form-control"/>
	   	</div>	
	    <div class="form-group"> 
	   		<label for="mprice4">우유값 입력</label>
	   		<input type="number" name="mprice"   id="mprice1"   class="form-control"/>
	   	</div>	   	  		
	   	<div class="form-group">
	   		<input type="submit" value="전송"  class="btn  btn-danger"/>
	   	</div>
   	  </fieldset> 	   	
   </form>    
   <script>
   	$(document).ready(function(){
   		$("#milkInsert").submit(function(){
   		    if(	$("#milkInsert   #mname1").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkInsert   #mname1").focus();
   		    	return false;
   		    }
   		    if(	$("#milkInsert   #mprice1").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkInsert   #mprice1").focus();
   		    	return false;
   		    }  		    
   		});
   	});
   </script>   
   <h3 class="panel-heading">2) MILKS 검색  : 확인할 우유이름을 입력해주세요</h3>
   <form method="get" 
   		 action=""   
   		 id="milkReader"> 
	  <fieldset>
	  <legend>MILKS 검색  </legend>	
	   	<div class="form-group"> 
	   		<label for="mno2">우유번호 입력</label>
	   		<input type="text" name="mno"   id="mno2"   class="form-control"/>
	   	</div>		
	   	<div class="form-group"> <input type="submit" value="전송"  class="btn  btn-danger"/> </div>
	  </fieldset> 	
   </form>
   
   <script>
   	$(document).ready(function(){
   		$("#milkReader").submit(function(){
   		    if(	$("#milkReader   #mno2").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkReader   #mno2").focus();
   		    	return false;
   		    }
   		});
   	});
   </script>   
   
   
   <!--   							  -->  
   <!--   							  -->     
   <h3 class="panel-heading">3) MILKS 수정 : 우유값인상</h3>   			
   <form method="post" 
   		 action=""   id="milkModify">
   	  <fieldset> 
   	  <legend>우유수정폼</legend>
	   	<div class="form-group"> 
	   		<label for="mno3">우유번호 입력</label>
	   		<input type="text" name="mno"   id="mno3"   class="form-control"/>
	   	</div>		
	    <div class="form-group"> 
	   		<label for="mname3">우유이름입력</label>
	   		<input type="text" name="mname"   id="mname3"   class="form-control"/>
	   	</div>	  
	    <div class="form-group"> 
	   		<label for="mprice3">우유값 입력</label>
	   		<input type="number" name="mprice"   id="mprice3"   class="form-control"/>
	   	</div>	  		
	   	<div class="form-group">
	   		<input type="submit" value="전송"  class="btn  btn-danger"/>
	   	</div>
	   </fieldset>		
   </form> 
   
   
   
   
   <script>
   	$(document).ready(function(){
   		$("#milkModify").submit(function(){
   		    if(	$("#milkModify   #mno3").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkModify   #mno2").focus();
   		    	return false;
   		    }
   		    
   		    if(	$("#milkModify   #mprice3").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkModify   #mprice3").focus();
   		    	return false;
   		    }   		    
   		});
   	});
   </script>         
      
      
      
   <!--   							  -->  
   <!--   							  -->     
   <h3 class="panel-heading">4) MILKS 삭제  :  삭제할 번호를 입력해주세요</h3>
   <form method="get" action=""  id="milkDelete">   	  
   	  <fieldset> 
   	  <legend>우유삭제폼</legend>
	   	<div class="form-group"> 
	   		<label for="mno4">우유번호 입력</label>
	   		<input type="text" name="mno"   id="mno4"   class="form-control"/>
	   	</div>	
	   	<div class="form-group">
	   		<input type="submit" value="전송"  class="btn  btn-danger"/>
	   	</div>
   	  </fieldset> 	   	
   </form>   
   <script>
   	$(document).ready(function(){
   		$("#milkDelete").submit(function(){
   		    if(	$("#milkDelete   #mno4").val() == "" ){
   		    	alert("빈칸입니다.\n확인해주세요");
   		    	$("#milkDelete   #mno4").focus();
   		    	return false;
   		    }
   		});
   	});
   </script>       
     
     
     
       
</div><!-- container END -->   
 </body>
</html>
